package Exam.Seat.Allocation.System.with.Spring.Boot.service;


import Exam.Seat.Allocation.System.with.Spring.Boot.dto.AllocationResponse;
import Exam.Seat.Allocation.System.with.Spring.Boot.dto.CandidateAllocation;
import Exam.Seat.Allocation.System.with.Spring.Boot.entity.Allocation;
import Exam.Seat.Allocation.System.with.Spring.Boot.entity.Candidate;
import Exam.Seat.Allocation.System.with.Spring.Boot.entity.ExamCenter;
import Exam.Seat.Allocation.System.with.Spring.Boot.entity.ExamSlot;
import Exam.Seat.Allocation.System.with.Spring.Boot.repository.AllocationRepository;
import Exam.Seat.Allocation.System.with.Spring.Boot.repository.CandidateRepository;
import Exam.Seat.Allocation.System.with.Spring.Boot.repository.ExamCenterRepository;
import Exam.Seat.Allocation.System.with.Spring.Boot.repository.ExamSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class AllocationService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private ExamCenterRepository examCenterRepository;

    @Autowired
    private ExamSlotRepository examSlotRepository;

    @Autowired
    private AllocationRepository allocationRepository;

    private final Map<String, Object> slotLocks = new ConcurrentHashMap<>();
    private static final String LAST_SLOT = "16:00–17:30";

    @Transactional
    public AllocationResponse allocateSeats() {
        // Clear previous allocations
        allocationRepository.deleteAll();

        List<Candidate> allCandidates = candidateRepository.findAllByOrderByRegistrationNumber();
        List<ExamCenter> allCenters = examCenterRepository.findAll();
        List<ExamSlot> allSlots = examSlotRepository.findAll();

        List<Allocation> allocations = new ArrayList<>();
        List<CandidateAllocation> allocationResults = new ArrayList<>();

        // Group candidates by registration number
        Map<String, List<Candidate>> candidatesByRegNumber = allCandidates.stream()
                .collect(Collectors.groupingBy(Candidate::getRegistrationNumber));

        int allocatedCount = 0;
        int pendingCount = 0;

        for (Map.Entry<String, List<Candidate>> entry : candidatesByRegNumber.entrySet()) {
            String regNumber = entry.getKey();
            List<Candidate> candidateApplications = entry.getValue();

            // Try to allocate all posts for this candidate
            List<Allocation> candidateAllocations = allocateCandidatePosts(
                    candidateApplications, allCenters, allSlots);

            allocations.addAll(candidateAllocations);

            // Convert to response DTO
            for (Allocation allocation : candidateAllocations) {
                Candidate candidate = candidateApplications.stream()
                        .filter(c -> c.getAppliedPost().equals(allocation.getAppliedPost()))
                        .findFirst()
                        .orElse(candidateApplications.get(0));

                CandidateAllocation ca = new CandidateAllocation(
                        allocation.getRegistrationNumber(),
                        candidate.getCandidateName(),
                        allocation.getAppliedPost(),
                        allocation.getCenterName(),
                        allocation.getSlotTime(),
                        allocation.getExamDate(),
                        allocation.getStatus().toString()
                );
                allocationResults.add(ca);

                if (allocation.getStatus() == Allocation.AllocationStatus.ALLOCATED) {
                    allocatedCount++;
                } else {
                    pendingCount++;
                }
            }
        }

        // Save all allocations
        allocationRepository.saveAll(allocations);

        return new AllocationResponse(
                "Allocation process completed successfully",
                allCandidates.size(),
                allocatedCount,
                pendingCount,
                allocationResults
        );
    }

    private List<Allocation> allocateCandidatePosts(List<Candidate> candidateApplications,
                                                    List<ExamCenter> centers,
                                                    List<ExamSlot> slots) {
        List<Allocation> allocations = new ArrayList<>();
        String regNumber = candidateApplications.get(0).getRegistrationNumber();
        boolean isFemale = "F".equalsIgnoreCase(candidateApplications.get(0).getGender());
        boolean isPwd = candidateApplications.stream().anyMatch(Candidate::getIsPwd);

        // Filter available centers based on PWD constraint
        List<ExamCenter> availableCenters = centers.stream()
                .filter(center -> !isPwd || center.getIsPwdFriendly())
                .collect(Collectors.toList());

        // Filter available slots based on gender constraint
        List<ExamSlot> availableSlots = slots.stream()
                .filter(slot -> !isFemale || !LAST_SLOT.equals(slot.getSlotTime()))
                .collect(Collectors.toList());

        // For multiple posts, we need to allocate all on same date, same center, different slots
        if (candidateApplications.size() > 1) {
            allocations = allocateMultiplePosts(regNumber, candidateApplications,
                    availableCenters, availableSlots);
        } else {
            // Single post allocation
            Allocation allocation = allocateSinglePost(regNumber, candidateApplications.get(0),
                    availableCenters, availableSlots);
            allocations.add(allocation);
        }

        return allocations;
    }

    private List<Allocation> allocateMultiplePosts(String regNumber,
                                                   List<Candidate> applications,
                                                   List<ExamCenter> centers,
                                                   List<ExamSlot> slots) {
        List<Allocation> allocations = new ArrayList<>();

        // Group slots by date
        Map<LocalDate, List<ExamSlot>> slotsByDate = slots.stream()
                .collect(Collectors.groupingBy(ExamSlot::getExamDate));

        // Try to find a center and date that can accommodate all posts
        for (ExamCenter center : centers) {
            for (Map.Entry<LocalDate, List<ExamSlot>> dateEntry : slotsByDate.entrySet()) {
                LocalDate date = dateEntry.getKey();
                List<ExamSlot> dateSlots = dateEntry.getValue();

                // Check if we have enough different slots for all posts
                if (dateSlots.size() >= applications.size()) {
                    // Try different combinations of slots
                    List<List<ExamSlot>> slotCombinations = generateSlotCombinations(dateSlots, applications.size());

                    for (List<ExamSlot> slotCombination : slotCombinations) {
                        if (canAccommodateAllPosts(center, slotCombination, date, applications)) {
                            // Allocate all posts
                            for (int i = 0; i < applications.size(); i++) {
                                Candidate candidate = applications.get(i);
                                ExamSlot slot = slotCombination.get(i);

                                Allocation allocation = new Allocation(
                                        regNumber,
                                        candidate.getAppliedPost(),
                                        center.getCenterName(),
                                        slot.getSlotTime(),
                                        date,
                                        Allocation.AllocationStatus.ALLOCATED
                                );
                                allocations.add(allocation);

                                // Reserve the seat
                                reserveSeat(center.getCenterName(), slot.getSlotTime(), date.toString());
                            }
                            return allocations;
                        }
                    }
                }
            }
        }

        // If no allocation found, mark all as pending
        for (Candidate candidate : applications) {
            Allocation allocation = new Allocation(
                    regNumber,
                    candidate.getAppliedPost(),
                    null, null, null,
                    Allocation.AllocationStatus.PENDING
            );
            allocations.add(allocation);
        }

        return allocations;
    }

    private Allocation allocateSinglePost(String regNumber, Candidate candidate,
                                          List<ExamCenter> centers, List<ExamSlot> slots) {
        // Try to find available slot and center
        for (ExamSlot slot : slots) {
            for (ExamCenter center : centers) {
                if (canAccommodatePost(center, slot, candidate)) {
                    // Reserve the seat
                    reserveSeat(center.getCenterName(), slot.getSlotTime(), slot.getExamDate().toString());

                    return new Allocation(
                            regNumber,
                            candidate.getAppliedPost(),
                            center.getCenterName(),
                            slot.getSlotTime(),
                            slot.getExamDate(),
                            Allocation.AllocationStatus.ALLOCATED
                    );
                }
            }
        }

        // No allocation found
        return new Allocation(
                regNumber,
                candidate.getAppliedPost(),
                null, null, null,
                Allocation.AllocationStatus.PENDING
        );
    }

    private boolean canAccommodatePost(ExamCenter center, ExamSlot slot, Candidate candidate) {
        String lockKey = center.getCenterName() + "_" + slot.getSlotTime() + "_" + slot.getExamDate();
        synchronized (slotLocks.computeIfAbsent(lockKey, k -> new Object())) {
            try {
                Integer allocatedSeats = allocationRepository.countAllocatedSeats(
                        center.getCenterName(), slot.getSlotTime(), slot.getExamDate().toString());
                return allocatedSeats < center.getCapacity();
            } finally {
                slotLocks.remove(lockKey);
            }
        }
    }

    private boolean canAccommodateAllPosts(ExamCenter center, List<ExamSlot> slots,
                                           LocalDate date, List<Candidate> applications) {
        for (ExamSlot slot : slots) {
            if (!canAccommodatePost(center, slot, applications.get(0))) {
                return false;
            }
        }
        return true;
    }

    private void reserveSeat(String centerName, String slotTime, String examDate) {
        // The actual reservation happens when we save the allocation
        // This method is for logical representation
    }

    private List<List<ExamSlot>> generateSlotCombinations(List<ExamSlot> slots, int size) {
        List<List<ExamSlot>> combinations = new ArrayList<>();
        generateCombinations(slots, size, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void generateCombinations(List<ExamSlot> slots, int size, int start,
                                      List<ExamSlot> current, List<List<ExamSlot>> combinations) {
        if (current.size() == size) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < slots.size(); i++) {
            current.add(slots.get(i));
            generateCombinations(slots, size, i + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }

    public List<CandidateAllocation> getAllocationsByRegistrationNumber(String registrationNumber) {
        List<Allocation> allocations = allocationRepository.findByRegistrationNumber(registrationNumber);
        List<Candidate> candidates = candidateRepository.findByRegistrationNumber(registrationNumber);

        Map<String, String> candidateNameMap = candidates.stream()
                .collect(Collectors.toMap(Candidate::getRegistrationNumber,
                        Candidate::getCandidateName));

        return allocations.stream()
                .map(allocation -> new CandidateAllocation(
                        allocation.getRegistrationNumber(),
                        candidateNameMap.get(allocation.getRegistrationNumber()),
                        allocation.getAppliedPost(),
                        allocation.getCenterName(),
                        allocation.getSlotTime(),
                        allocation.getExamDate(),
                        allocation.getStatus().toString()
                ))
                .collect(Collectors.toList());
    }
}
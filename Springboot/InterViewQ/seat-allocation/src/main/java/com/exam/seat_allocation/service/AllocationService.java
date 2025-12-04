package com.exam.seat_allocation.service;

import com.exam.seat_allocation.dto.AllocationDetail;
import com.exam.seat_allocation.dto.AllocationResponse;
import com.exam.seat_allocation.entity.*;
import com.exam.seat_allocation.exception.ResourceNotFoundException;
import com.exam.seat_allocation.repository.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// AllocationService.java
@RequiredArgsConstructor
@Service
@Transactional
public class AllocationService {

    private final CandidateRepository candidateRepository;
    private final CandidateApplicationRepository applicationRepository;
    private final CenterRepository centerRepository;
    private final ExamSlotRepository slotRepository;
    private final AllocationRepository allocationRepository;
    private final SlotCapacityRepository slotCapacityRepository;



    public void runAllocation() {
        // Clear existing allocations
        allocationRepository.deleteAll();
        slotCapacityRepository.deleteAll();

        // Initialize slot capacities
        initializeSlotCapacities();

        // Get all candidates with their applications
        List<CandidateApplication> allApplications = applicationRepository.findAll();
        Map<String, List<CandidateApplication>> applicationsByCandidate = allApplications.stream()
                .collect(Collectors.groupingBy(CandidateApplication::getRegistrationNumber));

        // Allocate for each candidate
        for (String regNumber : applicationsByCandidate.keySet()) {
            allocateForCandidate(regNumber, applicationsByCandidate.get(regNumber));
        }
    }

    private void initializeSlotCapacities() {
        List<Center> centers = centerRepository.findAll();
        List<ExamSlot> slots = slotRepository.findAll();

        for (Center center : centers) {
            for (ExamSlot slot : slots) {
                SlotCapacity slotCapacity = new SlotCapacity();
                slotCapacity.setCenter(center);
                slotCapacity.setSlot(slot);
                slotCapacity.setAllocatedCount(0);
                slotCapacityRepository.save(slotCapacity);
            }
        }
    }

    private void allocateForCandidate(String registrationNumber, List<CandidateApplication> applications) {
        Optional<Candidate> candidateOpt = candidateRepository.findByRegistrationNumber(registrationNumber);
        if (candidateOpt.isEmpty()) {
            markAllPending(registrationNumber, applications);
            return;
        }

        Candidate candidate = candidateOpt.get();

        if (applications.size() == 1) {
            // Single application
            allocateSingleApplication(candidate, applications.get(0));
        } else {
            // Multiple applications - need same center, different slots, same date
            allocateMultipleApplications(candidate, applications);
        }
    }

    private void allocateSingleApplication(Candidate candidate, CandidateApplication application) {
        List<ExamSlot> availableSlots = getAvailableSlotsForCandidate(candidate);
        List<Center> availableCenters = getAvailableCentersForCandidate(candidate);

        for (ExamSlot slot : availableSlots) {
            for (Center center : availableCenters) {
                if (tryAllocateSlot(center, slot)) {
                    createAllocation(candidate.getRegistrationNumber(), application.getAppliedPost(),
                            center, slot, Allocation.AllocationStatus.ALLOCATED);
                    return;
                }
            }
        }

        // If no allocation found, mark as pending
        createAllocation(candidate.getRegistrationNumber(), application.getAppliedPost(),
                null, null, Allocation.AllocationStatus.PENDING);
    }

    private void allocateMultipleApplications(Candidate candidate, List<CandidateApplication> applications) {
        List<ExamSlot> availableSlots = getAvailableSlotsForCandidate(candidate);
        List<Center> availableCenters = getAvailableCentersForCandidate(candidate);

        // For multiple applications, we need at least as many slots as applications
        if (availableSlots.size() < applications.size()) {
            markAllPending(candidate.getRegistrationNumber(), applications);
            return;
        }

        // Try to find a center that can accommodate all applications in different slots
        for (Center center : availableCenters) {
            List<ExamSlot> centerAvailableSlots = getAvailableSlotsForCenter(center, availableSlots);
            if (centerAvailableSlots.size() >= applications.size()) {
                // Try different combinations of slots
                if (tryAllocateMultipleInCenter(candidate, applications, center, centerAvailableSlots)) {
                    return;
                }
            }
        }

        // If no center can accommodate all applications
        markAllPending(candidate.getRegistrationNumber(), applications);
    }

    private boolean tryAllocateMultipleInCenter(Candidate candidate, List<CandidateApplication> applications,
                                                Center center, List<ExamSlot> availableSlots) {
        // This is a simplified approach - in production, you might want a more sophisticated algorithm
        List<ExamSlot> allocatedSlots = new ArrayList<>();

        for (CandidateApplication application : applications) {
            for (ExamSlot slot : availableSlots) {
                if (!allocatedSlots.contains(slot) && tryAllocateSlot(center, slot)) {
                    createAllocation(candidate.getRegistrationNumber(), application.getAppliedPost(),
                            center, slot, Allocation.AllocationStatus.ALLOCATED);
                    allocatedSlots.add(slot);
                    break;
                }
            }
        }

        // If we couldn't allocate all applications, rollback any allocations made
        if (allocatedSlots.size() < applications.size()) {
            for (ExamSlot slot : allocatedSlots) {
                deallocateSlot(center, slot);
            }
            allocationRepository.deleteByRegistrationNumber(candidate.getRegistrationNumber());
            return false;
        }

        return true;
    }

    private List<ExamSlot> getAvailableSlotsForCandidate(Candidate candidate) {
        List<ExamSlot> allSlots = slotRepository.findAll();

        // Female candidates cannot be allocated to last slot (16:00-17:30)
        if (candidate.getGender() == Candidate.Gender.F) {
            return allSlots.stream()
                    .filter(slot -> !slot.getSlotTime().equals("16:00–17:30"))
                    .collect(Collectors.toList());
        }

        return allSlots;
    }

    private List<Center> getAvailableCentersForCandidate(Candidate candidate) {
        if (Boolean.TRUE.equals(candidate.getIsPwd())) {
            return centerRepository.findByIsPwdFriendly(true);
        }
        return centerRepository.findAll();
    }

    private List<ExamSlot> getAvailableSlotsForCenter(Center center, List<ExamSlot> candidateSlots) {
        List<ExamSlot> availableSlots = new ArrayList<>();

        for (ExamSlot slot : candidateSlots) {
            Optional<SlotCapacity> capacityOpt = slotCapacityRepository.findByCenterAndSlot(center, slot);
            if (capacityOpt.isPresent()) {
                SlotCapacity capacity = capacityOpt.get();
                if (capacity.getAllocatedCount() < center.getCapacity()) {
                    availableSlots.add(slot);
                }
            }
        }

        return availableSlots;
    }

    @Transactional
    public boolean tryAllocateSlot(Center center, ExamSlot slot) {
        Optional<SlotCapacity> capacityOpt = slotCapacityRepository
                .findByCenterIdAndSlotIdWithLock(center.getCenterId(), slot.getSlotId());

        if (capacityOpt.isPresent()) {
            SlotCapacity capacity = capacityOpt.get();
            if (capacity.getAllocatedCount() < center.getCapacity()) {
                capacity.setAllocatedCount(capacity.getAllocatedCount() + 1);
                slotCapacityRepository.save(capacity);
                return true;
            }
        }

        return false;
    }

    private void deallocateSlot(Center center, ExamSlot slot) {
        Optional<SlotCapacity> capacityOpt = slotCapacityRepository
                .findByCenterIdAndSlotIdWithLock(center.getCenterId(), slot.getSlotId());

        if (capacityOpt.isPresent()) {
            SlotCapacity capacity = capacityOpt.get();
            capacity.setAllocatedCount(Math.max(0, capacity.getAllocatedCount() - 1));
            slotCapacityRepository.save(capacity);
        }
    }

    private void createAllocation(String registrationNumber, String appliedPost,
                                  Center center, ExamSlot slot, Allocation.AllocationStatus status) {
        Allocation allocation = new Allocation();
        allocation.setRegistrationNumber(registrationNumber);
        allocation.setAppliedPost(appliedPost);
        allocation.setCenter(center);
        allocation.setSlot(slot);
        allocation.setAllocationStatus(status);
        allocationRepository.save(allocation);
    }

    private void markAllPending(String registrationNumber, List<CandidateApplication> applications) {
        for (CandidateApplication application : applications) {
            createAllocation(registrationNumber, application.getAppliedPost(),
                    null, null, Allocation.AllocationStatus.PENDING);
        }
    }

    public AllocationResponse getAllocationDetails(String registrationNumber) {
        List<Allocation> allocations = allocationRepository.findByRegistrationNumber(registrationNumber);

        if (allocations.isEmpty()) {
            throw new ResourceNotFoundException("No allocations found for registration number: " + registrationNumber);
        }

        List<AllocationDetail> details = allocations.stream()
                .map(this::mapToAllocationDetail)
                .collect(Collectors.toList());

        return new AllocationResponse(registrationNumber, details);
    }

    private AllocationDetail mapToAllocationDetail(Allocation allocation) {
        return new AllocationDetail(
                allocation.getAppliedPost(),
                allocation.getAllocationStatus(),
                allocation.getCenter() != null ? allocation.getCenter().getCenterName() : null,
                allocation.getSlot() != null ? allocation.getSlot().getSlotTime() : null,
                allocation.getSlot() != null ? allocation.getSlot().getExamDate() : null
        );
    }
}

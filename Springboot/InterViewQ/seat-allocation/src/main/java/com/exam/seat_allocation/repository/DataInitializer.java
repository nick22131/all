package com.exam.seat_allocation.repository;


import com.exam.seat_allocation.entity.Candidate;
import com.exam.seat_allocation.entity.CandidateApplication;
import com.exam.seat_allocation.entity.Center;
import com.exam.seat_allocation.entity.ExamSlot;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer {

    private final CenterRepository centerRepository;
    private final ExamSlotRepository slotRepository;
    private final CandidateRepository candidateRepository;
    private final CandidateApplicationRepository applicationRepository;

    public DataInitializer(CenterRepository centerRepository, ExamSlotRepository slotRepository,
                           CandidateRepository candidateRepository,
                           CandidateApplicationRepository applicationRepository) {
        this.centerRepository = centerRepository;
        this.slotRepository = slotRepository;
        this.candidateRepository = candidateRepository;
        this.applicationRepository = applicationRepository;
    }

    @PostConstruct
    public void init() {
        initializeCenters();
        initializeSlots();
        initializeCandidates();
        initializeApplications();
    }

    private void initializeCenters() {
        if (centerRepository.count() == 0) {
            centerRepository.saveAll(List.of(
                    new Center("MIT College Pune", 30, true),
                    new Center("COEP Pune", 25, false),
                    new Center("Government Engg College Pune", 20, true)
            ));
        }
    }

    private void initializeSlots() {
        if (slotRepository.count() == 0) {
            LocalDate examDate = LocalDate.of(2025, 9, 15);
            slotRepository.saveAll(List.of(
                    new ExamSlot("09:00–10:30", examDate),
                    new ExamSlot("12:30–14:00", examDate),
                    new ExamSlot("16:00–17:30", examDate)
            ));
        }
    }

    private void initializeCandidates() {
        if (candidateRepository.count() == 0) {
            candidateRepository.saveAll(List.of(
                    new Candidate("101", "Abhay", Candidate.Gender.M, false),
                    new Candidate("102", "Sonam", Candidate.Gender.F, false),
                    new Candidate("103", "Ritika", Candidate.Gender.F, false),
                    new Candidate("104", "Akshay", Candidate.Gender.M, true)
            ));
        }
    }

    private void initializeApplications() {
        if (applicationRepository.count() == 0) {
            applicationRepository.saveAll(List.of(
                    new CandidateApplication("101", "Tech Assistant"),
                    new CandidateApplication("101", "Clerk"),
                    new CandidateApplication("102", "Clerk"),
                    new CandidateApplication("103", "Data Entry Operator"),
                    new CandidateApplication("104", "Tech Assistant")
            ));
        }
    }
}
package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.CandidateApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateApplicationRepository extends JpaRepository<CandidateApplication, Long> {
    List<CandidateApplication> findByRegistrationNumber(String registrationNumber);
    List<CandidateApplication> findByRegistrationNumberIn(List<String> registrationNumbers);
}
package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Optional<Candidate> findByRegistrationNumber(String registrationNumber);
    List<Candidate> findByIsPwd(Boolean isPwd);
}

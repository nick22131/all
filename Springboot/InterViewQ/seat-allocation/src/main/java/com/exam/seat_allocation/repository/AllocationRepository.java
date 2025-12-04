package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.Allocation;
import com.exam.seat_allocation.entity.Center;
import com.exam.seat_allocation.entity.ExamSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
    List<Allocation> findByRegistrationNumber(String registrationNumber);
    Optional<Allocation> findByRegistrationNumberAndAppliedPost(String registrationNumber, String appliedPost);
    boolean existsByCenterAndSlot(Center center, ExamSlot slot);

    void deleteByRegistrationNumber(String registrationNumber);
}
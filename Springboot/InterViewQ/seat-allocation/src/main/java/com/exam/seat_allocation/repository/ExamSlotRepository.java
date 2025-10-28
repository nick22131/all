package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.ExamSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExamSlotRepository extends JpaRepository<ExamSlot, Long> {
    List<ExamSlot> findByExamDateOrderBySlotTime(LocalDate examDate);
    ExamSlot findBySlotTimeAndExamDate(String slotTime, LocalDate examDate);
}
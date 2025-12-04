package Exam.Seat.Allocation.System.with.Spring.Boot.repository;


import Exam.Seat.Allocation.System.with.Spring.Boot.entity.ExamSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExamSlotRepository extends JpaRepository<ExamSlot, Long> {
    List<ExamSlot> findByExamDate(LocalDate examDate);
    List<ExamSlot> findBySlotTimeNot(String slotTime);
}
package Exam.Seat.Allocation.System.with.Spring.Boot.repository;

import Exam.Seat.Allocation.System.with.Spring.Boot.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
    List<Allocation> findByRegistrationNumber(String registrationNumber);

    @Query("SELECT a FROM Allocation a WHERE a.centerName = :centerName AND a.slotTime = :slotTime AND a.examDate = :examDate")
    List<Allocation> findByCenterAndSlotAndDate(@Param("centerName") String centerName,
                                                @Param("slotTime") String slotTime,
                                                @Param("examDate") String examDate);

    @Query("SELECT COUNT(a) FROM Allocation a WHERE a.centerName = :centerName AND a.slotTime = :slotTime AND a.examDate = :examDate AND a.status = 'ALLOCATED'")
    Integer countAllocatedSeats(@Param("centerName") String centerName,
                                @Param("slotTime") String slotTime,
                                @Param("examDate") String examDate);

    void deleteAll();
}
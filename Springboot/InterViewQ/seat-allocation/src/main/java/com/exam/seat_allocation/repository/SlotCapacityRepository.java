package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.Center;
import com.exam.seat_allocation.entity.ExamSlot;
import com.exam.seat_allocation.entity.SlotCapacity;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SlotCapacityRepository extends JpaRepository<SlotCapacity, Long> {
    Optional<SlotCapacity> findByCenterAndSlot(Center center, ExamSlot slot);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT sc FROM SlotCapacity sc WHERE sc.center.centerId = :centerId AND sc.slot.slotId = :slotId")
    Optional<SlotCapacity> findByCenterIdAndSlotIdWithLock(@Param("centerId") Long centerId, @Param("slotId") Long slotId);
}
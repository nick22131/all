package com.exam.seat_allocation.repository;

import com.exam.seat_allocation.entity.Center;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CenterRepository extends JpaRepository<Center, Long> {
    List<Center> findByIsPwdFriendly(Boolean isPwdFriendly);
}

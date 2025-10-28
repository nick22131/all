package com.exam.seat_allocation.dto;

import com.exam.seat_allocation.entity.Allocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllocationDetail {
    private String appliedPost;
    private Allocation.AllocationStatus status;
    private String centerName;
    private String slotTime;
    private LocalDate examDate;


}
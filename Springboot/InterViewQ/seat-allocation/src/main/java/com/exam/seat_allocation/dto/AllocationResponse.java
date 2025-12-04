package com.exam.seat_allocation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllocationResponse {
    private String registrationNumber;
    private List<AllocationDetail> allocations;


    // Getters and setters
}
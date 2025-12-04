package com.exam.seat_allocation.controller;

import com.exam.seat_allocation.dto.AllocationResponse;
import com.exam.seat_allocation.exception.ResourceNotFoundException;
import com.exam.seat_allocation.service.AllocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// AllocationController.java
@RestController
@RequestMapping("/api")
public class AllocationController {

    private final AllocationService allocationService;

    public AllocationController(AllocationService allocationService) {
        this.allocationService = allocationService;
    }

    @PostMapping("/allocate")
    public ResponseEntity<String> runAllocation() {
        try {
            allocationService.runAllocation();
            return ResponseEntity.ok("Allocation process completed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error during allocation: " + e.getMessage());
        }
    }

    @GetMapping("/allocation/{registrationNumber}")
    public ResponseEntity<AllocationResponse> getAllocationDetails(
            @PathVariable String registrationNumber) {
        try {
            AllocationResponse response = allocationService.getAllocationDetails(registrationNumber);
            return ResponseEntity.ok(response);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
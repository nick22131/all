package Exam.Seat.Allocation.System.with.Spring.Boot.controller;


import Exam.Seat.Allocation.System.with.Spring.Boot.dto.AllocationResponse;
import Exam.Seat.Allocation.System.with.Spring.Boot.dto.CandidateAllocation;
import Exam.Seat.Allocation.System.with.Spring.Boot.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AllocationController {

    @Autowired
    private AllocationService allocationService;

    @PostMapping("/allocate")
    public ResponseEntity<AllocationResponse> allocateSeats() {
        try {
            AllocationResponse response = allocationService.allocateSeats();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            AllocationResponse errorResponse = new AllocationResponse(
                    "Error during allocation: " + e.getMessage(), 0, 0, 0, null);
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }

    @GetMapping("/allocation/{registrationNumber}")
    public ResponseEntity<List<CandidateAllocation>> getAllocationByRegistrationNumber(
            @PathVariable String registrationNumber) {
        try {
            List<CandidateAllocation> allocations =
                    allocationService.getAllocationsByRegistrationNumber(registrationNumber);
            return ResponseEntity.ok(allocations);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}
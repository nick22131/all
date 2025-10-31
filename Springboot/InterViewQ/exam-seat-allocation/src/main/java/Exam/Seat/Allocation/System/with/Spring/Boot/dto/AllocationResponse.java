package Exam.Seat.Allocation.System.with.Spring.Boot.dto;



import lombok.Data;

import java.util.List;
@Data
public class AllocationResponse {
    private String message;
    private Integer totalCandidatesProcessed;
    private Integer allocatedCount;
    private Integer pendingCount;
    private List<CandidateAllocation> allocations;

    // Constructors, Getters and Setters
    public AllocationResponse() {}

    public AllocationResponse(String message, Integer totalCandidatesProcessed,
                              Integer allocatedCount, Integer pendingCount,
                              List<CandidateAllocation> allocations) {
        this.message = message;
        this.totalCandidatesProcessed = totalCandidatesProcessed;
        this.allocatedCount = allocatedCount;
        this.pendingCount = pendingCount;
        this.allocations = allocations;
    }


}
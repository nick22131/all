package Exam.Seat.Allocation.System.with.Spring.Boot.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateAllocation {
    private String registrationNumber;
    private String candidateName;
    private String appliedPost;
    private String centerName;
    private String slotTime;
    private LocalDate examDate;
    private String status;


}
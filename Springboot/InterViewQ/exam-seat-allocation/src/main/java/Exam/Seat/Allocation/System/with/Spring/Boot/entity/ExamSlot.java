package Exam.Seat.Allocation.System.with.Spring.Boot.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exam_slots")
public class ExamSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "slot_time")
    private String slotTime;

    @NotNull
    @Column(name = "exam_date")
    private LocalDate examDate;


}
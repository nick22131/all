package com.exam.seat_allocation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exam_slots")
public class ExamSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;

    @Column(nullable = false)
    private String slotTime;

    @Column(nullable = false)
    private LocalDate examDate;

    @CreationTimestamp
    private Timestamp createdAt;


    public ExamSlot(String slotTime, LocalDate examDate) {
        this.slotTime = slotTime;
    }
}
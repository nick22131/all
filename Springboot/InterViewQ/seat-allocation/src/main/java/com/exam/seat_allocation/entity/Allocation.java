package com.exam.seat_allocation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "allocations")
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationId;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Column(name = "applied_post", nullable = false)
    private String appliedPost;

    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;

    @ManyToOne
    @JoinColumn(name = "slot_id")
    private ExamSlot slot;

    @Enumerated(EnumType.STRING)
    @Column(name = "allocation_status")
    private AllocationStatus allocationStatus;

    @CreationTimestamp
    private Timestamp allocatedAt;


    public enum AllocationStatus {
        ALLOCATED, PENDING
    }


}
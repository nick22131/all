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
@Table(name = "candidate_applications")
public class CandidateApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Column(name = "applied_post", nullable = false)
    private String appliedPost;

    @CreationTimestamp
    private Timestamp createdAt;


    public CandidateApplication(String registrationNumber, String appliedPost) {
        this.registrationNumber = registrationNumber;
        this.appliedPost = appliedPost;
    }
}

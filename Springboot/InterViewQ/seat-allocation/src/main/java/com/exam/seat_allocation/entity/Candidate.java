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
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Column(name = "candidate_name", nullable = false)
    private String candidateName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(name = "is_pwd")
    private Boolean isPwd;

    @CreationTimestamp
    private Timestamp createdAt;

    public Candidate(String registrationNumber, String candidateName, Gender gender, boolean isPwd) {
        this.registrationNumber = registrationNumber;
        this.candidateName = candidateName;
        this.gender = gender;
        this.isPwd = isPwd;
    }

    // Constructors, getters, setters
    public enum Gender {
        M, F
    }


}
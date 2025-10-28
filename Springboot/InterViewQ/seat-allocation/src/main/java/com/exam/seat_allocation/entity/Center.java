package com.exam.seat_allocation.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "centers")
    public class Center {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long centerId;

        @Column(nullable = false)
        private String centerName;

        @Column(nullable = false)
        private Integer capacity;

        @Column(name = "is_pwd_friendly")
        private Boolean isPwdFriendly;

        @CreationTimestamp
        private Timestamp createdAt;

        @UpdateTimestamp
        private Timestamp updatedAt;


    public Center(String centerName, int capacity, boolean isPwdFriendly) {
        this.centerName = centerName;
        this.capacity = capacity;
        this.isPwdFriendly = isPwdFriendly;
    }
}


package com.example.stc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderID ;

    private String productName ;
    private Integer totalAmount;


    @ManyToOne
    @JoinColumn(referencedColumnName = "customerId")
    @JsonBackReference
    private CustomerEntity customer;

}

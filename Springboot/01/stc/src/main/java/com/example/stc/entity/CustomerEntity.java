package com.example.stc.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String customerId;

    public  String name;

    public  String surName;

    public Long mobileNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "addressId")
    public AddressEntity addressEntity;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true)
    public List<OrderEntity> order;



}

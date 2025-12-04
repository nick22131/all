package com.example.stc.controller;


import com.example.stc.entity.CustomerEntity;
import com.example.stc.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

     private final CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CustomerEntity customer){
        return  ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
    }

}

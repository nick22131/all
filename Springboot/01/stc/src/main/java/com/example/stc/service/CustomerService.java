package com.example.stc.service;


import com.example.stc.entity.CustomerEntity;
import com.example.stc.entity.OrderEntity;
import com.example.stc.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerEntity createCustomer(CustomerEntity customer) {

        OrderEntity order1 = new OrderEntity();

        for (OrderEntity order : customer.getOrder()) {
            order.setCustomer(customer); // 👈 critical line
        }
    return     customerRepository.save(customer);

    }
}

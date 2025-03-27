package com.example.Ecommerce_Admin.services;

import com.example.Ecommerce_Admin.repositories.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Long countCustomers(){
        return customerRepo.count();
    }
}

package com.example.Ecommerce_Admin.repositories;

import com.example.Ecommerce_Admin.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    long count();
}

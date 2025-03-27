package com.example.Ecommerce_Admin.services;

import com.example.Ecommerce_Admin.entities.Orders;
import com.example.Ecommerce_Admin.repositories.OrdersRepo;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SearchService {
    private final OrdersRepo ordersRepo;

    public SearchService(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }
    public List<Orders> search(String email, Date startDate, Date endDate){
        return ordersRepo.findByCustomer_CustomerEmailAndDateCreatedBetween(email, startDate, endDate);
    }
}

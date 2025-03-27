package com.example.Ecommerce_Admin.services;

import com.example.Ecommerce_Admin.repositories.OrdersRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrdersService {
    private final OrdersRepo ordersRepo;

    public OrdersService(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }
    public Long countOrders(){
        return ordersRepo.count();
    }
    public BigDecimal totalOrdersPrice(){
        return ordersRepo.totalOrdersPrice();
    }
}

package com.example.Ecommerce_Admin.repositories;

import com.example.Ecommerce_Admin.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Long> {
    long count();

    @Query(value = "Select SUM(o.totalPrice) FROM Orders o")
    BigDecimal totalOrdersPrice();

    List<Orders> findByCustomer_CustomerEmailAndDateCreatedBetween(String email, Date startDate, Date endDate);
}

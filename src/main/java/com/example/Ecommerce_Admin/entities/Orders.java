package com.example.Ecommerce_Admin.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String orderTrackingNumber;
    private Integer totalQuantity;
    private BigDecimal totalPrice;
    private String orderStatus;
    private Date dateCreated;
    private Date lastUpdated;
    private String razorpayId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

}

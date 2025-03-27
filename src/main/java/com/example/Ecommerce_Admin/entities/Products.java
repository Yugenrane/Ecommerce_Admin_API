package com.example.Ecommerce_Admin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Products {
    @Id
    private Long productId;  // Should match the Product Service ID

    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}

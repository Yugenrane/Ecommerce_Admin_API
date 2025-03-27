package com.example.Ecommerce_Admin.repositories;

import com.example.Ecommerce_Admin.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Long> {
    long count();
}

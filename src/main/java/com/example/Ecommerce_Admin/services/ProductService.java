package com.example.Ecommerce_Admin.services;

import com.example.Ecommerce_Admin.repositories.ProductsRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductsRepo productsRepo;

    public ProductService(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }
    public Long countProducts(){
        return productsRepo.count();
    }
}

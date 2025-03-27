package com.example.Ecommerce_Admin.restcontrollers;

import com.example.Ecommerce_Admin.entities.Orders;
import com.example.Ecommerce_Admin.repositories.OrdersRepo;
import com.example.Ecommerce_Admin.services.CustomerService;
import com.example.Ecommerce_Admin.services.OrdersService;
import com.example.Ecommerce_Admin.services.ProductService;
import com.example.Ecommerce_Admin.services.SearchService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final CustomerService customerService;
    private final OrdersService ordersService;
    private final ProductService productService;
    private final SearchService searchService;
    public AdminController(CustomerService customerService, OrdersService ordersService, ProductService productService, SearchService searchService) {
        this.customerService = customerService;
        this.ordersService = ordersService;
        this.productService = productService;
        this.searchService=searchService;
    }

    @GetMapping("/totalCustomers")
    public ResponseEntity<Long> countCustomers() {
        return ResponseEntity.ok(customerService.countCustomers());
    }

    @GetMapping("/totalOrders")
    public ResponseEntity<Long> countOrders() {
        return ResponseEntity.ok(ordersService.countOrders());
    }

    @GetMapping("/totalProducts")
    public ResponseEntity<Long> countProducts() {
        return ResponseEntity.ok(productService.countProducts());
    }

    @GetMapping("/totalAmount")
    public ResponseEntity<BigDecimal> totalOrderPrice() {
        return ResponseEntity.ok(ordersService.totalOrdersPrice());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Orders>> searchFunctionality(@RequestParam String email, @RequestParam Date startDate, @RequestParam Date endDate) {
        return ResponseEntity.ok(searchService.search(email, startDate, endDate));
    }
}


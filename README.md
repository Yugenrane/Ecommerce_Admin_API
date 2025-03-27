# E-commerce Admin API

## Overview
Spring Boot backend for managing products, orders, and customers in an e-commerce system.

## Features
✅ Manage customer accounts  
✅ Product inventory management  
✅ Order processing & status updates  
✅ Search & filtering for products  

---

## 🏗️ Project Structure
```
src/
├── main/
│   ├── java/com/example/Ecommerce_admin/
│   │   ├── entities/
│   │   │   ├── Customer.java
│   │   │   ├── Orders.java
│   │   │   ├── Products.java
│   │   ├── repositories/
│   │   │   ├── CustomerRepo.java
│   │   │   ├── OrdersRepo.java
│   │   │   ├── ProductsRepo.java
│   │   ├── services/
│   │   │   ├── CustomerService.java
│   │   │   ├── OrdersService.java
│   │   │   ├── ProductService.java
│   │   │   ├── SearchService.java
│   │   ├── restcontrollers/
│   │   │   ├── AdminController.java
│   └── resources/
│       └── application.properties
└── test/
```
---

## 🚀 API Endpoints
| Endpoint                 | Method | Request Body            | Description |
|--------------------------|--------|-------------------------|-------------|
| `POST /admin/addProduct`  | POST   | `ProductRequestDTO`    | Add new product to inventory |
| `GET /admin/getOrders`    | GET    | None                   | Retrieve all orders |
| `PUT /admin/updateOrder`  | PUT    | `OrderUpdateDTO`       | Update order status |
| `DELETE /admin/removeCustomer/{id}` | DELETE | None | Remove customer by ID |

---

## ⚙️ Setup
1. **Configure MySQL** in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/admin_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
2. **Run the application**:
```bash
mvn spring-boot:run
```

---

## 📌 Tech Stack
- **Backend:** Spring Boot 3.1  
- **Database:** MySQL 8.0  
- **Build Tool:** Maven  

---


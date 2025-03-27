# E-commerce Admin API

## Overview
The **E-commerce Admin API** is a RESTful backend application built with Spring Boot. It provides essential administrative features such as **customer management, order tracking, product inventory management, and search functionality**.

## Features
✅ Customer Management  
✅ Order Tracking & Total Revenue Calculation  
✅ Product Inventory Management  
✅ Search Orders by Customer Email & Date Range  
✅ Built with **Spring Boot 3.3.5** and **Java 17**  

---

## 📌 Tech Stack
- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Data JPA**
- **Maven**
- **MySQL**

---

## 🚀 API Endpoints

### **Customer API**
- **`GET /customers/count`** → Retrieves the total number of registered customers.

### **Order API**
- **`GET /orders/count`** → Fetches the total number of orders.
- **`GET /orders/total-price`** → Returns the total revenue from orders.

### **Product API**
- **`GET /products/count`** → Fetches the total number of products.

### **Search API**
- **`GET /orders/search?email={email}&startDate={yyyy-MM-dd}&endDate={yyyy-MM-dd}`**  
  → Retrieves orders for a customer within a specified date range.

---

## 🛠 Installation & Setup

### **Prerequisites**
- Java 17+
- Maven
- MySQL

### **Clone the Repository**
```sh
git clone https://github.com/your-username/ecommerce-admin-api.git
cd ecommerce-admin-api

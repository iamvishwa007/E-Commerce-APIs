🛒 E-Commerce API (Spring Boot)

A simple e-commerce backend REST API built using Spring Boot. It supports basic user registration, product management (by admin), and cart operations (by customers).

 📌 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- RESTful APIs
- MySQL
- Maven



 📁 Project Structure

src/
├── controller/
│   ├── AdminController.java
│   ├── CartController.java
│   ├── ProductController.java 
│   └── UserController.java
├── model/
│   ├── Cart.java
│   ├── Product.java
│   └── User.java
├── repository/
│   ├── CartItemRepo.java
│   ├── ProductRepo.java
│   └── UserRepo.java
├── service/
│   ├── CartService.java
│   ├── ProductService.java
│   └── UserService.java
└── ECommerceApiApplication.java


 ⚙️ How to Run the Project

1. Clone the Repository

   git clone https://github.com/yourusername/e-commerce-api.git
   cd e-commerce-api

2. Configure the Database

In application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db  
spring.datasource.username=root  
spring.datasource.password=your_password  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true

✅ Make sure MySQL is running and the database ecommerce_db exists.

3. Run the Project

   mvn spring-boot:run



📨 API Endpoints

👤 User Controller

🔹 Register a new user  
- POST /api/users/add

Request Body:
{
  "username": "john123",
  "fullName": "John Doe",
  "password": "123456",
  "role": "customer"
}

---

👮 Admin Controller

🔹 Add a new product  
- POST /api/admin/products

Request Body:
{
  "name": "iPhone 14",
  "description": "Latest Apple iPhone 14",
  "price": 79999.99,
  "stockQuantity": 25
}

🔹 Update a product by ID  
- PUT /api/admin/products/{id}

Request Body:
{
  "name": "iPhone 14 Pro",
  "description": "Upgraded Apple iPhone 14 Pro",
  "price": 99999.99,
  "stockQuantity": 10
}

🔹 Delete a product by ID  
- DELETE /api/admin/products/{id}

🔹 Get all registered users  
- GET /api/admin/allusers


 🛒 Cart Controller

🔹 Add item to cart  
- POST /api/user/cart

Request Body:
{
  "user": {
    "id": 1
  },
  "product": {
    "id": 2
  },
  "quantity": 3
}

🔹 Get user cart by user ID  
- GET /api/user/cart/{userId}

🔹 Remove item from cart  
- DELETE /api/user/cart/{itemId}

 🗃️ Database Models

🧑 User

Field       | Type    | Description  
------------|---------|-------------  
id          | Long    | Primary Key  
username    | String  | Unique, not null  
fullName    | String  | Not null  
password    | String  | Not null  
role        | String  | e.g., "admin", "customer"  

📦 Product

Field         | Type     | Description  
--------------|----------|-------------------  
id            | Long     | Primary Key  
name          | String   | Not null  
description   | Text     | Optional  
price         | double   | Not null  
stockQuantity | int      | Not null  

🛍️ Cart

Field     | Type    | Description  
----------|---------|-----------------------------  
id        | Long    | Primary Key  
user      | User    | Many-to-one (User FK)  
product   | Product | Many-to-one (Product FK)  
quantity  | int     | Quantity added to cart  


✅ Testing APIs in Postman

Use the following format for POST/PUT requests:

Headers:  
Content-Type: application/json

📧 Contact 
Email: iamvishwa007@example.com 

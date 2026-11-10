# Spring Boot Product Management

A backend application built using Spring Boot, Spring Data JPA, Hibernate, and MySQL to manage product information through REST APIs.

## Technologies Used

- Java 25
- Spring Boot 4.1.2
- Spring WebMVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA

## Project Structure

```text
ProductManagement
 └── src/main/java/com/productmanagement/ProductManagement
      ├── Controller
      │    └── ProductController.java
      ├── DTO
      │    └── ProductDTO.java
      ├── Model
      │    └── Product.java
      ├── Repository
      │    └── ProductRepository.java
      └── Service
           ├── ProductService.java
           └── ProductServiceImpl.java
```

## Implemented Features

- Add a product using a REST API.
- Receive product details as JSON.
- Transfer request data using a DTO.
- Save product details in MySQL using Spring Data JPA.

## API Details

### Add Product

| Property | Value |
|---|---|
| HTTP Method | POST |
| Endpoint | `/product/addproduct` |
| Content-Type | `application/json` |

**Request URL**

```text
http://localhost:8080/product/addproduct
```

**Sample JSON Request**

```json
{
  "productId": 101,
  "productName": "Laptop",
  "productPrice": 55000,
  "productQuantity": 5,
  "productCategory": "Electronics",
  "productDescription": "HP Laptop"
}
```

**Successful Response**

```text
product added successfully
```

## Database Configuration

Create a MySQL database named `productmanagement` and a table named `productdetails`.

Configure your database connection in `application.properties`.

Do not commit real database passwords or other credentials to GitHub.

## Application Flow

```text
Postman
   ↓
Controller
   ↓
DTO
   ↓
Service
   ↓
Repository
   ↓
Hibernate / JPA
   ↓
MySQL Database
```

## Screenshots

Screenshots of API testing and successful responses are available in the `screenshots` folder.

## Future Enhancements

- Get all products
- Get product by ID
- Update product details
- Delete a product
- Add validation and exception handling

---
**Learning Project:** Developed to understand Spring Boot REST APIs, layered architecture, Spring Data JPA, and MySQL integration.

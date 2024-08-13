# Tokonyadia
Tokonyadia is a Spring Boot mini project designed to help you learn backend development. It simulates a basic e-commerce platform with two types of users: regular users and admins. The project uses PostgreSQL for data management and showcases Inversion of Control (IoC) principles.

## Overview
Tokonyadia provides a practical example of building a backend system. Users can register, browse products, and make purchases, while admins can manage the product catalog. This project is an excellent way to understand backend development with Spring Boot and PostgreSQL.

## Features

 - **User Management:** Register, browse products, and make purchases. 
 - **Admin Dashboard:** Manage product inventory with CRUD operations.

## Technology Stack

 - **Spring Boot:** For developing backend services and RESTful APIs.
 
 - **PostgreSQL:** Relational database for data storage. JPA/Hibernate: ORM
   for managing database interactions.

## Inversion of Control (IoC)
Tokonyadia leverages Spring Boot’s IoC container to manage dependencies:
 - **Dependency Injection:** Simplifies configuration and enhances
   testability.
 - **Component Scanning:** Automatically detects and registers beans.
 - **Configuration Management:** Manages application settings efficiently.
## Workflow
1. **User Registration:** Users create accounts to access the system.
2. **Product Browsing and Purchasing:** Users explore products and complete transactions.
3. **Admin Management:** Admins manage products to keep the catalog up-to-date.
## Learning Goals
- **Spring Boot and IoC:** Explore Inversion of Control and dependency management.
- **PostgreSQL Integration:** Learn to integrate and manage a PostgreSQL database.
- **Backend Design:** Understand backend architecture and user roles.
## Getting Started

1. **Clone the Repository:**
    ```bash
    git clone <repository-url>
    ```

2. **Set Up PostgreSQL:** Configure PostgreSQL and create the database.

3. **Configure Application:** Update `application.properties` with PostgreSQL settings.

4. **Run the Application:**
    ```bash
    ./mvnw spring-boot:run
    ```

# Java Authentication System

## Overview

A Java web application that implements a basic user authentication workflow using Jakarta Servlets, JDBC, Maven, and MySQL.

The project follows a layered architecture to separate request handling, business logic, and database access.

---

## Features

- User registration
- User login
- Username validation
- Database persistence using JDBC
- Layered architecture (Controller, Service, Repository)
- Maven project structure

---

## Technologies

- Java
- Jakarta Servlet
- JSP
- Maven
- JDBC
- MySQL
- Apache Tomcat

---

## Project Structure

```
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
```

---

## Layers

### Controller

Handles incoming HTTP requests using Jakarta Servlets.

### Service

Contains the authentication business logic and input validation.

### Repository

Communicates with the MySQL database using JDBC and SQL queries.

---

## Database

The project stores user credentials inside a MySQL database using JDBC connections and prepared statements.

---

## Build Tool

The project uses Maven for dependency management and packaging.

---

## Future Improvements

- Password hashing (BCrypt)
- Spring Boot migration
- Spring Security
- JWT authentication
- REST API implementation
- Input validation improvements
- Unit testing with JUnit
- Docker support

---

## Author

Sania Zadegh

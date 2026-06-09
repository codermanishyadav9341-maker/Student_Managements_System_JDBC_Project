# Student Management System

A Java-based console application developed using JDBC and MySQL to manage student records. The project follows the DAO (Data Access Object) pattern and provides complete CRUD operations.

## Features

- Add Student
- View All Students
- Search Student by ID
- Update Student Details
- Delete Student Records

## Technologies Used

- Java
- JDBC
- MySQL
- OOP (Object-Oriented Programming)
- DAO Design Pattern

## Project Structure

text
src/
├── Student.java
├── DBConnection.java
├── StudentDAO.java
├── StudentDAOImpl.java
└── Main.java


## Database Setup

sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50)
);


## How to Run

1. Clone the repository.
2. Create the MySQL database and table.
3. Add MySQL Connector/J to the project.
4. Configure database credentials in DBConnection.java.
5. Run Main.java.

## Learning Outcomes

- JDBC Connectivity
- CRUD Operations
- PreparedStatement
- ResultSet Handling
- Exception Handling
- DAO Pattern
- MySQL Integration

## Future Enhancements

- Login & Registration Module
- Search by Name
- Pagination
- Spring Boot Migration
- REST API Integration

## Author

*Manish Yadav*

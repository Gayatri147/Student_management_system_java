# Student_management_system_java
Student Management System using Java and MySQL with JDBC, implementing CRUD operations and OOP principles.
# Student Management System (Java + MySQL)

This is a console-based Student Management System developed using Java and MySQL. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records with database integration using JDBC.

## 🚀 Features
- Add new student records
- View all students
- Update existing student details
- Delete student records
- Persistent data storage using MySQL

## 🛠️ Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL

## 🧠 Concepts Implemented
- Object-Oriented Programming (OOP)
- Data Access Object (DAO) Design Pattern
- Exception Handling
- Database Connectivity
- Prepared Statements (for secure queries)

## ⚙️ Project Structure
- `Main.java` → User interface and program flow
- `Student.java` → Model class (data representation)
- `StudentDAO.java` → Database operations (CRUD logic)
- `DBConnection.java` → Database connection setup

## 🗄️ Database Setup
```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    marks DOUBLE
);

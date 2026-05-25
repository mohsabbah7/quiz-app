 🧠 Quiz Application

A secure quiz web application built with Spring Boot, Thymeleaf, and Spring Security.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3.5.14
- Spring Security
- Spring MVC
- Thymeleaf
- Maven

## ✨ Features
- Secure login system with role-based authentication
- Interactive quiz with multiple choice questions
- Score calculation and results page
- Logout mechanism

## 🚀 How to Run
1. Clone the repo
   git clone https://github.com/mohsabbah7/quiz-app.git
2. Navigate to the project folder
   cd quiz-app
3. Run the application
   ./mvnw spring-boot:run
4. Open your browser and go to
   http://localhost:8080/login

## 👤 Default Users
| Username | Password | Role  |
|----------|----------|-------|
| user     | password | USER  |
| admin    | password | ADMIN |

## 📁 Project Structure
- model - User and Question classes
- controller - QuizController handles HTTP requests
- service - Business logic for users and questions
- config - Spring Security configuration

# Complaint / Grievance Management System

A full-stack Complaint & Grievance Management System built using **Spring Boot**, **Spring Security**, **JWT Authentication**, and **PostgreSQL**. The system provides secure role-based access for users and administrators to manage complaints from creation to resolution with a structured workflow.

---

# Features

## Authentication & Authorization
- Secure JWT-based authentication
- Role-Based Access Control (RBAC)
- User Registration
- User Login
- Password Encryption using BCrypt
- Protected REST APIs
- Token Validation

---

## User Features

- Register and Login
- Create Complaints
- Upload Complaint Details
- Add Complaint Description
- Select Complaint Category
- Set Complaint Priority
- View Complaint Status
- View Complaint History
- Track Complaint Progress
- Edit Complaint (Before Processing)
- Close Complaint after Resolution
- Dashboard showing submitted complaints

---

## Admin Features

- Secure Admin Login
- View All Complaints
- Assign Complaints
- Change Complaint Status
- Update Resolution Notes
- Manage Complaint Workflow
- View User Details
- Complaint Analytics Dashboard
- Monitor Pending Complaints
- Monitor Resolved Complaints

---

## Complaint Workflow

The complaint follows a structured lifecycle.

```
Created
    │
    ▼
Assigned
    │
    ▼
In Progress
    │
    ▼
Resolved
    │
    ▼
Closed
```

Each status transition is recorded for tracking and auditing.

---

## Geolocation Support

The system supports location-aware complaints.

Features include:

- Latitude & Longitude Storage
- Complaint Location Mapping
- Nearby Complaint Identification
- Area-wise Complaint Monitoring
- Region-based Analytics

---

## Analytics Dashboard

The dashboard provides real-time statistics.

Examples:

- Total Complaints
- Pending Complaints
- Assigned Complaints
- In Progress Complaints
- Resolved Complaints
- Closed Complaints
- Category-wise Distribution
- Priority-wise Distribution
- Monthly Complaint Trends
- Resolution Time Analysis

---

# Technology Stack

## Backend

- Java 21
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate
- JWT Authentication
- Maven

---

## Database

- PostgreSQL

---

## API Testing

- Postman

---

## Build Tool

- Maven

---

# Project Architecture

```
Client
   │
   ▼
REST API
   │
   ▼
Spring Security
(JWT Authentication)
   │
   ▼
Controller Layer
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
PostgreSQL Database
```

---

# Project Structure

```
Complaint-Management-System
│
├── src
│   ├── main
│   │
│   ├── java
│   │     ├── controller
│   │     ├── service
│   │     ├── repository
│   │     ├── entity
│   │     ├── dto
│   │     ├── security
│   │     ├── config
│   │     ├── exception
│   │     └── util
│   │
│   └── resources
│         ├── application.properties
│         └── static
│
├── pom.xml
└── README.md
```

---

# Database Entities

## User

- id
- name
- email
- password
- phone
- role

---

## Complaint

- id
- title
- description
- category
- priority
- status
- createdAt
- updatedAt
- latitude
- longitude
- userId

---

## Resolution

- id
- complaintId
- resolvedBy
- resolutionNotes
- resolvedDate

---

# REST APIs

## Authentication APIs

| Method | Endpoint |
|---------|-----------|
| POST | /api/auth/register |
| POST | /api/auth/login |

---

## User APIs

| Method | Endpoint |
|---------|-----------|
| POST | /api/complaints |
| GET | /api/complaints |
| GET | /api/complaints/{id} |
| PUT | /api/complaints/{id} |
| DELETE | /api/complaints/{id} |

---

## Admin APIs

| Method | Endpoint |
|---------|-----------|
| GET | /api/admin/complaints |
| PUT | /api/admin/assign/{id} |
| PUT | /api/admin/status/{id} |
| PUT | /api/admin/resolve/{id} |
| GET | /api/admin/dashboard |

---

# Security

The application uses Spring Security with JWT Authentication.

Security Features:

- Stateless Authentication
- JWT Token Validation
- Password Encryption
- Role-Based Authorization
- Secure REST Endpoints
- Authentication Filters
- Exception Handling

---

# Installation

## Clone Repository

```bash
git clone https://github.com/yourusername/Complaint-Management-System.git
```

---

## Navigate to Project

```bash
cd Complaint-Management-System
```

---

## Configure PostgreSQL

Update

```
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/complaints
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Project

```bash
mvn spring-boot:run
```

or

```bash
Run the Spring Boot Application from your IDE.
```

---

# Testing

Use Postman to test the APIs.

Example flow:

1. Register User
2. Login
3. Receive JWT Token
4. Add Token in Authorization Header
5. Create Complaint
6. Admin Login
7. Assign Complaint
8. Update Status
9. Resolve Complaint
10. User Closes Complaint

---

# Future Enhancements

- Email Notifications
- SMS Alerts
- Push Notifications
- File/Image Upload Support
- Google Maps Integration
- AI-based Complaint Categorization
- Complaint Priority Prediction
- OCR Document Upload
- Department-wise Routing
- Audit Logs
- Elasticsearch Integration
- Docker Deployment
- Kubernetes Deployment
- CI/CD Pipeline
- Redis Caching
- Swagger/OpenAPI Documentation

---

# Learning Outcomes

This project demonstrates practical experience with:

- Spring Boot REST API Development
- Spring Security
- JWT Authentication
- PostgreSQL Database Design
- Hibernate & JPA
- Role-Based Access Control
- Exception Handling
- Layered Architecture
- RESTful API Design
- Workflow Management
- Geolocation Handling
- Backend System Design

---

# Author

**Vikas K A**

Electronics & Communication Engineering

Backend Developer | Java | Spring Boot | PostgreSQL | REST APIs | JWT | Hibernate

---

# License

This project is developed for educational and portfolio purposes.

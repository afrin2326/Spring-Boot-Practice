# Spring Boot Practice

A collection of beginner-to-intermediate **Spring Boot practice projects** covering standalone applications, web applications, JavaBeans, and DAO-based CRUD operations using **Java, Spring Boot, Maven, and MySQL**.

This repository contains hands-on examples developed while learning and practicing core Spring Boot concepts and application development patterns.

---

## 📂 Projects

### 1. SpringBootBasicStandaloneProgran

A basic Spring Boot standalone application demonstrating the fundamental structure and startup process of a Spring Boot project.

**Concepts covered:**

* Spring Boot application setup
* `@SpringBootApplication`
* Application context
* Spring Boot project structure
* Maven configuration

---

### 2. SpringBootBasicWebProgran

A basic Spring Boot web application demonstrating how to create a simple web endpoint using Spring MVC.

**Concepts covered:**

* Spring Boot Web
* Spring MVC
* Controllers
* Request mapping
* HTTP requests and responses
* Embedded server configuration

**Example endpoint:**

```text
http://localhost:8081/
```

---

### 3. SpringBootBeanProgram

A Spring Boot project demonstrating the use of **JavaBeans and Spring-managed beans**.

**Concepts covered:**

* JavaBeans
* Spring Beans
* Dependency Injection
* Configuration classes
* `@Bean`
* Spring Application Context

---

### 4. SpringBootDAOCrudOperation

A database-driven Spring Boot application demonstrating **DAO-based CRUD operations** using MySQL.

**Concepts covered:**

* DAO pattern
* CRUD operations
* MySQL database connectivity
* Spring JDBC
* `JdbcTemplate`
* SQL queries
* Dependency Injection
* Database configuration

CRUD operations include:

* Create
* Read
* Update
* Delete

---

## 🛠️ Technologies Used

| Technology   | Purpose                         |
| ------------ | ------------------------------- |
| Java         | Programming language            |
| Spring Boot  | Application framework           |
| Spring MVC   | Web application development     |
| Spring JDBC  | Database operations             |
| MySQL        | Relational database             |
| Maven        | Dependency and build management |
| Git & GitHub | Version control                 |

---

## 📚 Concepts Practiced

This repository focuses on practical implementation of:

* Spring Boot fundamentals
* Spring Application Context
* Dependency Injection
* Spring Beans
* JavaBeans
* Configuration classes
* Spring MVC
* Controllers
* DAO architecture
* CRUD operations
* JDBC database connectivity
* MySQL integration
* Maven project management
* Application properties

---

## ⚙️ Requirements

Before running these projects, make sure the following are installed:

* **Java 17+**
* **Maven**
* **MySQL** — required for the DAO CRUD project
* **Git** — optional, for cloning the repository

Check Java version:

```bash
java -version
```

Check Maven version:

```bash
mvn -version
```

---

## 🚀 Getting Started

Clone the repository:

```bash
git clone https://github.com/afrin2326/Spring-Boot-Practice.git
```

Navigate into the repository:

```bash
cd Spring-Boot-Practice
```

Each project is an independent Maven-based Spring Boot application.

For example:

```bash
cd SpringBootBasicStandaloneProgran
```

Run the application using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 🗄️ Database Configuration

`SpringBootDAOCrudOperation` requires a database connection.

Database credentials are **not stored in this repository**.

The application uses environment variables:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Set the required environment variables on your local machine before running the database project.

Example:

```text
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
```

> Never commit real database credentials, passwords, API keys, or other sensitive information to GitHub.

---

## 🔐 Security

This repository follows basic credential-security practices.

* Database credentials are excluded from source control.
* Sensitive configuration values are provided through environment variables.
* Build output directories such as `target/` are ignored.
* Local environment files such as `.env` are ignored.

---

## 📁 Repository Structure

```text
Spring-Boot-Practice/
│
├── .gitignore
│
├── SpringBootBasicStandaloneProgran/
│   ├── pom.xml
│   └── src/
│
├── SpringBootBasicWebProgran/
│   ├── pom.xml
│   └── src/
│
├── SpringBootBeanProgram/
│   ├── pom.xml
│   └── src/
│
└── SpringBootDAOCrudOperation/
    ├── pom.xml
    └── src/
```

---

## 🎯 Learning Goals

The main purpose of this repository is to build a strong practical foundation in **Spring Boot application development**, starting from basic standalone applications and gradually moving toward web applications and database-driven CRUD systems.

The projects serve as hands-on practice for understanding how different Spring Boot components work together in real applications.

---

## 👩‍💻 Author

**Mst Afrin Binte Amin**

Computer Science & Engineering
AI/ML Enthusiast | Java & Spring Boot Developer | Aspiring Researcher

* GitHub: [@afrin2326](https://github.com/afrin2326)
* LinkedIn: [Mst Afrin Binte Amin](https://www.linkedin.com/in/afrin-binte-amin-48a52b417/)

---

## ⭐ Repository

If you find these practice projects useful for learning Spring Boot, feel free to explore the individual projects and use them as learning references.

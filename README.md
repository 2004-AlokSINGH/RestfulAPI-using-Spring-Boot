# User Management System

## Description

This is a simple User Management System API built using Spring Boot. It allows users to register and fetch user details based on email and password.

## Technologies Used

- Java 17
- Spring Boot 2.7.0
- Spring Data JPA
- MySQL
- Springdoc OpenAPI for Swagger documentation

## Getting Started

### Prerequisites

- Java 11 or later ( I am using JAVA 17)
- Maven
- MySQL

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/2004-AlokSINGH/RestfulAPI-using-Spring-Boot.git
   cd userAuth

2. **Configure the database:**

   Create a MySQL database named `user_db` and update the `src/main/resources/application.properties` file with your database credentials.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/user_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   ```

3. **Build and run the application:**

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access Swagger UI:**

   Open your browser and navigate to `http://localhost:3035/swagger-ui.html` to access the Swagger UI for API documentation and testing.

## API Endpoints

### Register User

- **URL:** `/api/user/register`
- **Method:** `POST`
- **Request Body:**

  ```json
  {
    "username": "testuser",
    "email": "test@example.com",
    "password": "password123"
  }
  ```

- **Responses:**
  - `200 OK`: User registered successfully
  - `400 Bad Request`: Mail already registered
  - `500 Internal Server Error`: Error registering user

- **Example Curl Command:**

  ```sh
  curl -X POST http://localhost:3035/api/user/register -H "Content-Type: application/json" -d '{"username": "testuser", "email": "test@example.com", "password": "password123"}'
  ```

### Fetch User

- **URL:** `/api/user/fetch`
- **Method:** `GET`
- **Query Parameters:**
  - `email` (required): Email of the user
  - `password` (required): Password of the user

- **Responses:**
  - `200 OK`: User details
  - `404 Not Found`: Invalid credentials, no user found
  - `500 Internal Server Error`: Internal server error

- **Example Curl Command:**

  ```sh
  curl -X GET "http://localhost:3035/api/user/fetch?email=test@example.com&password=password123"
  ```

## Running Tests

You can run the unit tests using Maven:

```sh
mvn test
```

## Screenshots
![Screenshot 2024-06-18 223858](https://github.com/2004-AlokSINGH/RestfulAPI-using-Spring-Boot/assets/123860933/1d1be32a-5158-490e-888d-13ea84cf3602)



## Contact

If you have any questions or suggestions, feel free to reach out to me at [alokmail](mailto:thakuraloksingh186@gmail.com).

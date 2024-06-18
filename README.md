
### README.md

```markdown
# User Management System

## Description

This is a simple User Management System API built using Spring Boot. It allows users to register and fetch user details based on email and password.

## Technologies Used

- Java 11
- Spring Boot 2.7.0
- Spring Data JPA
- MySQL
- Springdoc OpenAPI for Swagger documentation

## Getting Started

### Prerequisites

- Java 11 or later
- Maven
- MySQL

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/your-username/user-management-system.git
   cd user-management-system
   ```

2. **Configure the database:**

   Create a MySQL database named `user_db` and update the `src/main/resources/application.properties` file with your database credentials.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/user_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
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


## Contact

If you have any questions or suggestions, feel free to reach out to me at [alokmail](mailto:thakuraloksingh@gmail.com).

---

Happy Coding!
```

### Steps to Follow

1. **Create a new public repository on GitHub:**
   - Go to GitHub and create a new repository named `user-management-system`.

2. **Commit your solution code to the repository:**
   - Initialize the repository and commit all your project files.

   ```sh
   git init
   git add .
   git commit -m "Initial commit"
   git remote add origin https://github.com/2004-AlokSINGH/RestfulAPI-using-Spring-Boot.git
   git push -u origin main
   ```

3. **Update the README file with instructions on how to run the application and any other relevant information:**
   - Save the above content as `README.md` in the root directory of your project.
   - Commit the `README.md` file to the repository.

   ```sh
   git add README.md
   git commit -m "Add README file"
   git push
   ```

4. **Share the repository URL:**
   - Provide the URL of your GitHub repository, e.g., `https://github.com/your-username/user-management-system`.

By following these steps, you'll have a comprehensive README file that helps others understand how to run and use your application.

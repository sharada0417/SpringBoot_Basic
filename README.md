# Java Spring Boot REST API Example

This is a simple Spring Boot application that exposes REST endpoints to return predefined messages.

## Project Structure

- **AppController.java**: Contains the REST API endpoints.
  - `@RestController`: Indicates that this class handles REST requests.
  - `@RequestMapping("/app")`: Maps all endpoints under `/app`.
  - `@GetMapping("/msg")`: Returns a welcome message.
  - `@GetMapping("/name")`: Returns a predefined name message.
  - `@GetMapping("/age")`: Returns a predefined age message.
  - `@GetMapping("/regno")`: Returns a predefined registration number message.

## Technologies Used

- **Java**: The primary programming language for the application.
- **Spring Boot**: A framework for building Java-based RESTful web services.
- **Maven**: Dependency management and build automation tool.

## How to Run the Application

1. Clone the repository:
   ```sh
   git clone <https://github.com/sharada0417/SpringBoot_Basic.git>
   ```
2. Navigate to the project directory:
   ```sh
   cd basic
   ```
3. Build and run the application using Maven:
   ```sh
   mvn spring-boot:run
   ```
4. The application will start on `http://localhost:8080`

## API Endpoints

### 1. `/app/msg`
- **Method**: `GET`
- **Description**: Returns a welcome message.
- **Response**:
  ```json
  "Hello SpringBoot"
  ```

### 2. `/app/name`
- **Method**: `GET`
- **Description**: Returns a predefined name message.
- **Response**:
  ```json
  "Hello My name is SpringBoot"
  ```

### 3. `/app/age`
- **Method**: `GET`
- **Description**: Returns a predefined age message.
- **Response**:
  ```json
  "Hello My age is 23"
  ```

### 4. `/app/regno`
- **Method**: `GET`
- **Description**: Returns a predefined registration number message.
- **Response**:
  ```json
  "Hello My reg no is 51"
  ```

## License
This project is open-source and available under the MIT License.

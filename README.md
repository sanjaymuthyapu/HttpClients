
**Spring Boot 3.4.2 Application with Java 17 and Gradle 8.4**

This project is a Spring Boot application using Java 17, Spring Boot 3.4.2, and Gradle 8.4. It provides a basic setup for a RESTful API and can be customized according to your needs.

### Prerequisites
Before running the project, make sure you have the following installed:
- Java 17 (JDK 17)
- Gradle 8.4
- Spring Boot 3.4.2 (This version is used in the project)

### Install Gradle
If you don't have Gradle installed, you can [download and install it from Gradle's official site](https://gradle.org/install/). Alternatively, you can use the Gradle wrapper provided in the project.

To check if Gradle is installed, run:
```bash
gradle -v
```

### Setting Up the Project
1. **Clone the Repository**
   First, clone the repository:
   ```bash
   git clone https://github.com/your-username/your-project-name.git
   cd your-project-name
   ```

2. **Install Dependencies**
   Since this project uses Gradle 8.4, you can build the project with the following command:
   ```bash
   ./gradlew build
   ```
   This will automatically download the necessary dependencies and compile the project.

3. **Configure Application**
   Make sure your `application.properties` (or `application.yml`) file contains the necessary configurations. Here's an example `application.properties`:

   ```properties
   # application.properties
   server.port=8080
   spring.datasource.url=jdbc:mysql://localhost:3306/mydb
   spring.datasource.username=root
   spring.datasource.password=root
   ```

4. **Run the Application**
   To run the application, use the following command:
   ```bash
   ./gradlew bootRun
   ```
   This will start the Spring Boot application on the default port 8080.

5. **Access the Application**
   Once the application is running, you can access the REST API at `http://localhost:8080`.

### Example REST API Endpoints
Here are some example API endpoints that you can use:
- `GET /api/hello` – Get a "Hello World" message.
- `POST /api/users` – Create a new user (send JSON data).
- `GET /api/users/{id}` – Get details of a user by ID.

#### Example Request:
```bash
curl -X GET http://localhost:8080/api/hello
```

#### Example Response:
```json
{
  "message": "Hello, World!"
}
```

### Notes
- This application is built with Spring Boot 3.4.2, Java 17, and Gradle 8.4.
- If you encounter any issues or have questions, feel free to open an issue on GitHub.

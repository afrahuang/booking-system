# 🏨 Simple Booking System

## 📌 Introduction
This is a simple hotel booking website built with Spring Boot. It allows users to browse available rooms, make reservations, and manage their bookings.

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Spring MVC, Spring Data JPA
- **Database:** MySQL / PostgreSQL (configurable)
- **Frontend:** Thymeleaf (or API for frontend integration)
- **Build Tool:** Maven / Gradle
- **Security:** Spring Security (optional for authentication)
- **Containerization:** Docker, Docker Compose

## 🚀 Features
- View available rooms
- Make a reservation
- Manage bookings (view, update, cancel)
- User authentication (optional)

## 📦 Installation
### Prerequisites
- JDK 17+
- Maven / Gradle
- Docker & Docker Compose

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/booking-system.git
   cd booking-system
   ```
2. Configure database in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/springboot
   spring.datasource.username=root
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Start services using Docker Compose:
   ```sh
   docker-compose up -d
   ```
   This will start MySQL, Redis, and phpMyAdmin for local development.

4. Build and run the application:
   ```sh
   ./mvnw spring-boot:run
   ```
   or (if using Gradle):
   ```sh
   ./gradlew bootRun
   ```
5. Open the browser and visit:
   ```
   http://localhost:8080
   ```

## 🛠 API Endpoints (if REST API is enabled)
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | `/rooms` | Get available rooms |
| POST | `/bookings` | Create a new booking |
| GET | `/bookings/{id}` | View booking details |
| PUT | `/bookings/{id}` | Update booking |
| DELETE | `/bookings/{id}` | Cancel booking |

## 📝 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Feel free to contribute and improve the system! 😊

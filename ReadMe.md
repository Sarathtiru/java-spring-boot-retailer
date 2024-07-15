Retailer Rewards Program
This application calculates reward points for customers based on their purchases. Customers earn points as follows:

- 2 points for every dollar spent over $100 in each transaction.
- 1 point for every dollar spent between $50 and $100 in each transaction.

Technologies Used
Spring Boot
Spring Data JPA
H2 Database
SLF4J for Logging

Getting Started

Prerequisites
Java 8 or higher
Maven

Installation
Clone the repository:

git clone https://github.com/yourusername/java-spring-boot-retailer.git

Navigate to the project directory:

cd java-spring-boot-retailer

Build the project:

mvn clean install

Running the Application

Start the application:

mvn spring-boot:run

The application will be available at http://localhost:8080.

REST Endpoints
GET /rewards: Retrieves the reward points for all customers.

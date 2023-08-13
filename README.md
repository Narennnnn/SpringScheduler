# SpringScheduler Project

![Java](https://img.shields.io/badge/Java-11-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.5-green)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)

A dynamic data retrieval system built using Java and Spring Boot that fetches data from a REST API at regular intervals and stores it in a MySQL database. This project demonstrates the use of scheduled tasks, REST API consumption, and database management with Spring Data JPA.

## Tech Stack

- Java 11
- Spring Boot 2.5.5
- MySQL 8

## Features

- Scheduled data retrieval from a REST API
- Storing fetched data in a MySQL database
- Preventing duplicate entries using unique constraints
- Efficient data management using Spring Data JPA

## Getting Started

1. Clone the repository: `git clone https://github.com/Narennnnn/SpringScheduler.git`
2. Navigate to the project directory: `cd SpringScheduler`
3. Configure your MySQL database credentials in `src/main/resources/application.properties`
4. Build the project: `./mvnw clean install`
5. Run the application: `./mvnw spring-boot:run`

## Usage

- The application fetches data from a fake API every 20 seconds(flexible) and stores it in the database.
- Access the endpoint to fetch and store data: `GET /SpringScheduler/get-all-fake-posts`

## Contribution

Contributions to this project are welcome! Feel free to open issues and submit pull requests.

## Contact

Connect with me on [LinkedIn](https://www.linkedin.com/in/yourlinkedinprofile/) to know more about this project and my other works.

Happy coding!

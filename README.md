# SpringBoot-api-student-management
The "SpringBoot-api-student-management" repository is a CRUD API designed to handle student information within an educational system. Leveraging the Spring Boot framework, this API provides comprehensive functionality for Creating, Reading, Updating, and Deleting (CRUD) student records.


## Overview

This repository contains a Spring Boot API for student management. The API provides CRUD operations to manage student information within an educational system.

## Features

- **CRUD Operations:** Perform Create, Read, Update, and Delete operations on student records.
- **Spring Boot:** Developed using the Spring Boot framework for easy setup and deployment.

## Getting Started

### Prerequisites

- Java: Ensure you have Java installed. The recommended version can be found in the [pom.xml](./pom.xml) file.
- Eclipse: The project is developed using Eclipse IDE, but you can use your preferred IDE.

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/emsy178/SpringBoot-api-student-management.git
    ```

2. Open the project in your IDE.

### Usage

1. Run the application.

2. Access the API endpoints for student management.
- **API Endpoints**
The following endpoints are available for student management:
- **Get All Students:**
  - Endpoint: `/api/v1/students`
  - Method: GET
  - Description: Retrieve a list of all students.

- **Get Student by ID:**
  - Endpoint: `/api/v1/students/{id}`
  - Method: GET
  - Description: Retrieve details of a specific student by ID.

- **Add New Student:**
  - Endpoint: `/api/v1/students`
  - Method: POST
  - Description: Add a new student to the system.

- **Update Student:**
  - Endpoint: `/api/v1/students/{id}`
  - Method: PUT
  - Description: Update details of a specific student by ID.

- **Delete Student:**
  - Endpoint: `/api/v1/students/{id}`
  - Method: DELETE
  - Description: Delete a specific student by ID.

Feel free to explore and interact with these endpoints to manage student records efficiently.

### License

This project is licensed under the [MIT License](./LICENSE).

## Contributing

Feel free to contribute to this project. Fork the repository, make your changes, and submit a pull request.

## Contact

For any questions or concerns, please [contact us](mailto:your-fayeoctaveemmanuel5@gmail.com).


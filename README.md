# Medical-API
# Janitri Backend Assignment

## Overview
This project is a simplified version of a company’s backend that creates devices that monitor patient’s heart rate data. It includes managing users, patients, and heart rate data.

## Setup
1. Clone the repository.
2. Import the project into your IDE.
3. Run the application using `mvn spring-boot:run`.

## API Documentation
- **User Registration:** `POST /users/register`
- **User Login:** `POST /users/login`
- **Add Patient:** `POST /patients`
- **Get Patient:** `GET /patients/{id}`
- **Record Heart Rate:** `POST /heartrates`
- **Get Heart Rates:** `GET /heartrates/{patientId}`

## Assumptions
- Email and password are used for user authentication.
- Heart rate data is associated with a patient ID.

## Additional Information
- The project uses an in-memory H2 database.

# Parking Lot System

## Overview
A comprehensive parking lot management system built using Spring Boot. This system includes functionality for ticket creation, parking slot management, fare calculation, and invoice generation. It provides an efficient way to handle parking slots, vehicle types, and ticketing processes in a parking lot environment.

## Features
- **Ticket Generation**: Creates tickets upon vehicle entry.
- **Parking Slot Management**: Tracks slot availability and handles slot assignment.
- **Invoice Generation**: Computes parking charges based on time spent in the lot.
- **Strategy Pattern**: Flexible fare calculation and parking slot finding strategies.

## Technologies Used
- Spring Boot
- Java 17
- Lombok
- Spring Data
- Custom Strategies (Slot finding, Fare Calculation)

## Setup
1. Clone the repository.
2. Run the application using `mvn spring-boot:run`.
3. Use Postman to test endpoints.

## Endpoints
- **POST /ticket**: Create a new parking ticket.
- **POST /invoice**: Generate invoice after vehicle exit.

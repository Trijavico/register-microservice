# General Documentation of the Microservices System

## Description

This microservices system simulates a customer management environment with fraud verification. It consists of three independent microservices: `Customer`, `Fraud`, and a Eureka server for service registration and discovery.

## Microservice Customer

### Functionality
- Provides an endpoint for registering new customers.
- Utilizes an external fraud verification service.

### Technologies Used
- Spring Boot
- PostgreSQL
- Eureka (for service registration and discovery)

## Microservice Fraud

### Functionality
- Offers an endpoint to check if a customer is fraudulent.

### Technologies Used
- Spring Boot
- PostgreSQL
- Eureka (for service registration and discovery)

## Eureka Server

### Functionality
- Acts as a server for service registration and discovery.

### Technologies Used
- Spring Boot
- Eureka

## Configuration

The configuration of each microservice is done through `application.properties` files. The `Customer` and `Fraud` services register with the Eureka server.

## System Usage

1. Start the Eureka server (`EurekaServerApplication`).
2. Start the services specified in the Docker Compose file
3. Start the `Customer` and `Fraud` microservices.
4. The services will be available on the configured ports.
5. The `Customer` microservice provides an endpoint for customer registration.
6. The `Fraud` microservice provides an endpoint to verify the authenticity of a customer.

## Considerations

- The `Customer` and `Fraud` services communicate with each other to perform fraud verification.
- The microservices-based architecture allows scalability and independent maintenance of each component.

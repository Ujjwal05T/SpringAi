# Spring AI Chat Application

A simple chat application built with Spring Boot and Spring AI that allows users to interact with AI models through a REST API.

## Overview

This project demonstrates the integration of AI models with Spring Boot using the Spring AI library. It provides a simple endpoint to send prompts and receive AI-generated responses.

## Prerequisites

- Java 17 or higher
- Maven
- Spring Boot 3.x
- Spring AI dependencies

## Project Structure

- `src/main/java/com/ai/springai/`: Contains the main application logic and controller.
- `src/main/resources/`: Contains the application properties and any static resources.
- `pom.xml`: The Maven build file.

## Setup

1. Clone the repository
2. Configure your AI model credentials in `application.properties`
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

#### Parameters

- `prompt` (required): The text prompt to send to the AI model


## Configuration

Add your AI model configuration in `application.properties`:


## Dependencies

- Spring Boot
- Spring AI
- Spring Web

## Contributing

Feel free to submit issues and enhancement requests.
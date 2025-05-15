// Package declaration - defines the package this class belongs to
package com.example.demo;

// Importing Spring Boot classes for application setup
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Main application class with Spring Boot annotations
@SpringBootApplication // Indicates this is a Spring Boot application
@RestController       // Marks this class as a REST controller for handling HTTP requests
public class SpringBootDemoApplication {

    // Main method - Entry point of the Spring Boot application
    public static void main(String[] args) {
        // Launches the Spring Boot application
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    // A simple GET request handler
    @GetMapping("/wow") // Maps HTTP GET requests to this method at the URL /wow
    public String wow() {
        // Returns a response message to the client
        return String.format("Wow! That was really easy!");
    }
}


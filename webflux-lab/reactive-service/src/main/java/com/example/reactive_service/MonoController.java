// Package declaration - Defines the package for the MonoController class
// The package name is critical and must match the main application package for Spring Boot to detect this controller
package com.example.reactive_service;

// Importing necessary Spring Web and Reactive libraries
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * A Spring WebFlux controller that demonstrates the use of Mono (Reactive Programming).
 * Mono is a Reactive type in Project Reactor that can emit a single value or complete without a value.
 */
@RestController // Marks this class as a Spring REST controller, making it capable of handling HTTP requests
public class MonoController {

    /**
     * Handles HTTP GET requests to the "/mono" endpoint.
     * This method returns a Mono (a single reactive stream) containing a simple string message.
     * 
     * @return A Mono containing the string "Hello, Mono!".
     */
    @GetMapping("/mono") // Maps HTTP GET requests to this method
    public Mono<String> getMono() {
        // Creates a Mono that emits the string "Hello, Mono!"
        return Mono.just("Hello, Mono!");
    }
}


// Package declaration - Defines the package for the FluxController class
package com.example.reactive_service;

// Importing necessary Spring Web and Reactive libraries
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * A Spring WebFlux controller that demonstrates the use of Flux (Reactive Programming).
 * Flux is a Reactive type in Project Reactor that can emit multiple values (0 to N).
 */
@RestController // Marks this class as a Spring REST controller, making it capable of handling HTTP requests
public class FluxController {

    /**
     * Handles HTTP GET requests to the "/flux" endpoint.
     * This method returns a Flux (a reactive stream) containing multiple string values.
     * 
     * @return A Flux emitting a sequence of strings ("Spring", "Boot", "WebFlux", "Demo").
     */
    @GetMapping("/flux") // Maps HTTP GET requests to this method
    public Flux<String> getFlux() {
        // Creates a Flux that emits multiple string values
        return Flux.just("Spring", "Boot", "WebFlux", "Demo") // Emits each string as a separate event
                   .log()        // Logs the events and signals of the Flux (for debugging purposes)
                   .limitRate(2); // Applies backpressure, requesting 2 elements at a time (for demonstration)
    }
}


package com.example.aopdemo.service;

// Importing Spring's @Service annotation
import org.springframework.stereotype.Service;

/**
 * CheckoutService class - Provides a method to simulate a checkout process.
 * This class is marked as a Spring Service component.
 */
@Service 
// @Service - Marks this class as a Service component in the Spring application.
// This means it is automatically detected and registered as a Spring Bean.
public class CheckoutService {

    /**
     * Simulates the checkout process for a user.
     * This method is designed to demonstrate how a checkout process works.
     * 
     * @param username the username of the user checking out
     */
    public void processCheckout(String username) {
        // Printing a message indicating that the checkout is starting
        System.out.println("Processing checkout for user: " + username);
        
        try {
            // Simulating a delay in the checkout process using Thread.sleep
            // This is to mimic some processing time (e.g., payment processing).
            Thread.sleep(1000); // 1000 milliseconds (1 second)
        } catch (InterruptedException e) {
            // If the thread is interrupted, we re-interrupt the thread
            // This is considered best practice to maintain the interrupt flag
            Thread.currentThread().interrupt();
        }

        // Printing a message indicating that the checkout process is complete
        System.out.println("Checkout completed.");
    }
}


package com.example.exception;

/**
 * Custom exception for inventory-related errors.
 */
public class InventoryException extends Exception {
    /**
     * Constructs an InventoryException with the given message.
     * @param message the error message
     */
    public InventoryException(String message) {
        super(message); // refers to the constructor in the parent class and passes to it "message"
    }
}


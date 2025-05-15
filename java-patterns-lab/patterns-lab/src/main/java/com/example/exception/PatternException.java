package com.example.exception;

/**
 * Custom exception for design pattern-related errors.
 */
public class PatternException extends Exception {
    /**
     * Constructs a PatternException with the given message.
     * @param message the error message
     */
    public PatternException(String message) {
        super(message);
    }
}


// Package declaration - Defines the package for the custom exception class
package com.example.exception;

/**
 * Custom exception class for handling task-related errors.
 * This exception can be used to signal errors specific to task operations
 * within an application.
 */
public class TaskException extends Exception {

    /**
     * Constructor for TaskException that accepts an error message.
     * This message provides details about the error that occurred.
     *
     * @param message The descriptive error message for the exception.
     */
    public TaskException(String message) {
        // Calls the constructor of the superclass (Exception) with the specified message
        super(message);
    }
}


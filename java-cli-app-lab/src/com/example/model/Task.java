package com.example.model;

/**
 * Represents a to-do task with a description and completion status.
 */
public class Task {
    private String description;
    private boolean isCompleted;

    /**
     * Constructs a Task with the given description.
     * @param description the task description
     */
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    /**
     * Gets the task description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the task is completed.
     * @return true if completed, false otherwise
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Marks the task as completed.
     */
    public void markCompleted() {
        this.isCompleted = true;
    }

    /**
     * Returns a string representation of the task.
     * @return the task details
     */
    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }
}


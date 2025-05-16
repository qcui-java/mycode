// Package declaration - Defines the package for the Task entity class
package com.example.model;

// Importing JPA annotations for entity mapping
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents a Task entity for JPA (Java Persistence API).
 * This class is used to map tasks to a database table.
 */
@Entity  // Marks this class as a JPA entity (table in the database)
public class Task {

    // Primary key field for the task (unique identifier)
    @Id
    private String id;
    
    // Description of the task
    private String description;
    
    // Completion status of the task (true if completed)
    private boolean completed;

    /**
     * Default constructor for JPA.
     * This is required for JPA to create entity instances.
     */
    public Task() {
    }

    /**
     * Parameterized constructor for creating a Task object with details.
     * 
     * @param id          The unique identifier for the task
     * @param description The description of the task
     * @param completed   The completion status of the task (true/false)
     */
    public Task(String id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    /**
     * Gets the task ID.
     * 
     * @return The unique identifier of the task
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the task ID.
     * 
     * @param id The unique identifier to set for the task
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the task description.
     * 
     * @return The description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the task description.
     * 
     * @param description The description to set for the task
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Checks if the task is completed.
     * 
     * @return true if the task is completed, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the completion status of the task.
     * 
     * @param completed The completion status to set (true/false)
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Provides a string representation of the task object.
     * This is useful for debugging or logging task details.
     * 
     * @return A formatted string with task details
     */
    @Override
    public String toString() {
        return "Task{id='" + id + "', description='" + description + "', completed=" + completed + "}";
    }
}


package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents a task entity for JPA.
 */
@Entity
public class Task {
    @Id
    private String id;
    private String description;
    private boolean completed;

    /**
     * Default constructor for JPA.
     */
    public Task() {
    }

    /**
     * Constructs a Task with the given details.
     * @param id the task ID
     * @param description the task description
     * @param completed the completion status
     */
    public Task(String id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    /**
     * Gets the task ID.
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the task ID.
     * @param id the ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the task description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the task description.
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Checks if the task is completed.
     * @return true if completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the completion status.
     * @param completed the status
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Returns a string representation of the task.
     * @return the task details
     */
    @Override
    public String toString() {
        return "Task{id='" + id + "', description='" + description + "', completed=" + completed + "}";
    }
}


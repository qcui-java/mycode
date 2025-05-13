package com.example.service;

import com.example.model.Task;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of to-do tasks.
 */
public class TaskManager {
    private List<Task> tasks;

    /**
     * Constructs an empty TaskManager.
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a new task with the given description.
     * @param description the task description
     */
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    /**
     * Marks a task as completed by its index.
     * @param index the task index (0-based)
     */
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        }
    }

    /**
     * Displays all tasks.
     */
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}


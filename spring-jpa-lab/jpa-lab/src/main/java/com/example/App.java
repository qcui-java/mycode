// Package declaration - Defines the package for the Spring Boot application
package com.example;

// Importing required classes and interfaces
import com.example.exception.TaskException;
import com.example.model.Task;
import com.example.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class to demonstrate Spring Data JPA operations.
 * This application demonstrates CRUD operations on Task entities using a service layer.
 */
@SpringBootApplication // Marks this class as a Spring Boot application
public class App implements CommandLineRunner {
    
    // Dependency on the TaskService for managing tasks
    private final TaskService taskService;

    /**
     * Constructs the application with the TaskService.
     * Spring Boot automatically injects the TaskService dependency (Constructor Injection).
     * 
     * @param taskService The task service for handling task operations
     */
    public App(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Main method - Entry point for the Spring Boot application.
     * It launches the Spring application context.
     *
     * @param args Command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * Runs the application after it starts, demonstrating various JPA operations.
     * This method is executed automatically because the class implements CommandLineRunner.
     *
     * @param args Command-line arguments passed to the application
     * @throws Exception If an error occurs during task operations
     */
    @Override
    public void run(String... args) throws Exception {
        try {
            // Creating tasks (Day 1 - Object-Oriented Programming)
            taskService.saveTask(new Task("T1", "Write code", false)); // Task not completed
            taskService.saveTask(new Task("T2", "Test app", true));    // Task completed
            taskService.saveTask(new Task("T3", "Deploy app", false)); // Task not completed

            // Reading all tasks (Day 2 - Collections)
            System.out.println("All Tasks: " + taskService.findAllTasks());

            // Reading only completed tasks (Day 3 - Lambdas in query)
            System.out.println("Completed Tasks: " + taskService.findTasksByCompleted(true));

            // Updating a task (Changing the status of the first task to completed)
            Task task = taskService.findAllTasks().get(0); // Get the first task
            task.setCompleted(true);                        // Mark it as completed
            taskService.saveTask(task);                     // Save the updated task
            System.out.println("Updated Task: " + task);

            // Deleting a task (Task with ID "T3")
            taskService.deleteTask("T3");
            System.out.println("Tasks after deletion: " + taskService.findAllTasks());

        } catch (TaskException e) {
            // Handling any custom TaskException that may occur
            System.err.println("Error: " + e.getMessage());
        }
    }
}


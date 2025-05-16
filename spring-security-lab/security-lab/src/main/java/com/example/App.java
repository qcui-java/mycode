package com.example;

// Import statements for required classes
import com.example.exception.TaskException;
import com.example.model.Task;
import com.example.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Spring Boot application to demonstrate Spring Security.
 */
@SpringBootApplication
// @SpringBootApplication - Combines three annotations:
// @Configuration: Marks this class as a configuration class for Spring.
// @EnableAutoConfiguration: Enables auto-configuration of the Spring application context.
// @ComponentScan: Scans for Spring components, configurations, and services.
public class App implements CommandLineRunner {

    private final TaskService taskService;

    /**
     * Constructs the application with the task service.
     * @param taskService the task service (business logic handler)
     */
    public App(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Main method to start the Spring Boot application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args); // Bootstraps the application
    }

    /**
     * Runs the application and demonstrates secured operations.
     * @param args command-line arguments
     * @throws Exception if any error occurs during execution
     */
    @Override
    public void run(String... args) throws Exception {
        try {
            // Simulating an admin user for security context
            SecurityContextHolder.getContext().setAuthentication(
                new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(
                    // Creating a user with username "admin", password "admin", and role "ADMIN"
                    User.withUsername("admin").password("admin").roles("ADMIN").build(),
                    null, // No credentials required here
                    User.withUsername("admin").password("admin").roles("ADMIN").build().getAuthorities()
                )
            );

            // Admin operations (admin has permission to perform all actions)
            System.out.println("Admin operations:");
            
            // Creating and saving tasks as admin
            taskService.saveTask(new Task("T1", "Write code", false)); // Task ID: T1, not completed
            taskService.saveTask(new Task("T2", "Test app", true));    // Task ID: T2, completed

            // Fetching and displaying all tasks
            System.out.println("All Tasks: " + taskService.findAllTasks());

            // Fetching and displaying only completed tasks
            System.out.println("Completed Tasks: " + taskService.findTasksByCompleted(true));

            // Deleting a specific task by ID (allowed as admin)
            taskService.deleteTask("T1");

            // Displaying tasks after deletion to confirm
            System.out.println("Tasks after deletion: " + taskService.findAllTasks());

            // Simulating a standard user for security context
            SecurityContextHolder.getContext().setAuthentication(
                new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(
                    // Creating a user with username "user", password "user", and role "USER"
                    User.withUsername("user").password("user").roles("USER").build(),
                    null, // No credentials required here
                    User.withUsername("user").password("user").roles("USER").build().getAuthorities()
                )
            );

            // User operations (limited access compared to admin)
            System.out.println("\nUser operations:");

            // Saving a new task as a standard user
            taskService.saveTask(new Task("T3", "Deploy app", false)); // Task ID: T3, not completed
            
            // Displaying all tasks after user addition
            System.out.println("All Tasks: " + taskService.findAllTasks());

            // Attempting to delete a task as a standard user (should fail)
            try {
                taskService.deleteTask("T2");
            } catch (Exception e) {
                // Catching the exception as the delete operation should not be allowed for users
                System.out.println("User delete failed: " + e.getMessage());
            }

        } catch (TaskException e) {
            // Handling any TaskException thrown during the task operations
            System.err.println("Error: " + e.getMessage());
        }
    }
}


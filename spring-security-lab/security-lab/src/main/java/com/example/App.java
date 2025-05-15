package com.example;

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
public class App implements CommandLineRunner {
    private final TaskService taskService;

    /**
     * Constructs the application with the task service.
     * @param taskService the task service
     */
    public App(TaskService taskService) {
        this.taskService = taskService;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * Runs the application, testing secured operations.
     * @param args command-line arguments
     * @throws Exception if an error occurs
     */
    @Override
    public void run(String... args) throws Exception {
        try {
            // Simulate admin user
            SecurityContextHolder.getContext().setAuthentication(
                new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(
                    User.withUsername("admin").password("admin").roles("ADMIN").build(),
                    null,
                    User.withUsername("admin").password("admin").roles("ADMIN").build().getAuthorities()
                )
            );

            // Admin operations
            System.out.println("Admin operations:");
            taskService.saveTask(new Task("T1", "Write code", false));
            taskService.saveTask(new Task("T2", "Test app", true));
            System.out.println("All Tasks: " + taskService.findAllTasks());
            System.out.println("Completed Tasks: " + taskService.findTasksByCompleted(true));
            taskService.deleteTask("T1");
            System.out.println("Tasks after deletion: " + taskService.findAllTasks());

            // Simulate user
            SecurityContextHolder.getContext().setAuthentication(
                new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(
                    User.withUsername("user").password("user").roles("USER").build(),
                    null,
                    User.withUsername("user").password("user").roles("USER").build().getAuthorities()
                )
            );

            // User operations
            System.out.println("\nUser operations:");
            taskService.saveTask(new Task("T3", "Deploy app", false));
            System.out.println("All Tasks: " + taskService.findAllTasks());
            try {
                taskService.deleteTask("T2"); // Should fail
            } catch (Exception e) {
                System.out.println("User delete failed: " + e.getMessage());
            }

        } catch (TaskException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


package com.example.service;

import com.example.exception.TaskException;
import com.example.model.Task;
import com.example.repository.TaskRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for managing tasks with JPA and security.
 * This class is part of the Service layer in the application,
 * handling business logic related to tasks.
 */
@Service // Marks this class as a Service component in Spring (part of the Service layer).
public class TaskService {
    
    private final TaskRepository taskRepository;

    /**
     * Constructs the TaskService with the given repository.
     * @param taskRepository the task repository (data access layer)
     */
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Saves a task. (Accessible by roles: USER or ADMIN)
     * 
     * @param task the task to save
     * @return the saved task
     * @throws TaskException if the task is invalid (missing ID or description)
     */
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    // @PreAuthorize - Security annotation that restricts access to this method
    // hasRole('USER') or hasRole('ADMIN') - Only users with USER or ADMIN roles can access this method
    public Task saveTask(Task task) throws TaskException {
        // Validate that the task has a non-null ID and description
        if (task.getId() == null || task.getDescription() == null) {
            throw new TaskException("Task ID and description cannot be null");
        }
        
        // Save the task using the JPA repository and return it
        return taskRepository.save(task);
    }

    /**
     * Retrieves all tasks. (Accessible by roles: USER or ADMIN)
     * 
     * @return the list of all tasks
     */
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    // @PreAuthorize - Restricts access to users with USER or ADMIN roles
    public List<Task> findAllTasks() {
        // Fetches all tasks from the database using the repository
        return taskRepository.findAll();
    }

    /**
     * Finds tasks by their completion status. (Accessible by roles: USER or ADMIN)
     * 
     * @param completed the completion status (true or false)
     * @return the list of tasks matching the status
     */
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    // @PreAuthorize - Restricts access to users with USER or ADMIN roles
    public List<Task> findTasksByCompleted(boolean completed) {
        // Fetches tasks that match the specified completion status
        return taskRepository.findByCompleted(completed);
    }

    /**
     * Deletes a task by its ID. (Accessible by ADMIN role only)
     * 
     * @param id the ID of the task to delete
     * @throws TaskException if the task does not exist
     */
    @PreAuthorize("hasRole('ADMIN')")
    // @PreAuthorize - Only users with the ADMIN role can access this method
    public void deleteTask(String id) throws TaskException {
        // Check if the task exists, otherwise throw an exception
        if (!taskRepository.existsById(id)) {
            throw new TaskException("Task not found: " + id);
        }
        
        // Delete the task using the repository
        taskRepository.deleteById(id);
    }
}


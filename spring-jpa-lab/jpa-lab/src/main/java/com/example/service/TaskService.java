package com.example.service;

import com.example.exception.TaskException;
import com.example.model.Task;
import com.example.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service for managing tasks with JPA.
 */
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    /**
     * Constructs the TaskService with the given repository.
     * @param taskRepository the task repository
     */
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Saves a task.
     * @param task the task to save
     * @return the saved task
     * @throws TaskException if the task is invalid
     */
    public Task saveTask(Task task) throws TaskException {
        if (task.getId() == null || task.getDescription() == null) {
            throw new TaskException("Task ID and description cannot be null");
        }
        return taskRepository.save(task);
    }

    /**
     * Finds all tasks.
     * @return the list of tasks
     */
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Finds tasks by completion status.
     * @param completed the completion status
     * @return the matching tasks
     */
    public List<Task> findTasksByCompleted(boolean completed) {
        return taskRepository.findByCompleted(completed);
    }

    /**
     * Deletes a task by ID.
     * @param id the task ID
     * @throws TaskException if the task is not found
     */
    public void deleteTask(String id) throws TaskException {
        if (!taskRepository.existsById(id)) {
            throw new TaskException("Task not found: " + id);
        }
        taskRepository.deleteById(id);
    }
}


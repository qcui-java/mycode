// Package declaration - Defines the package for the TaskRepository interface
package com.example.repository;

// Importing the Task model (entity) and JpaRepository interface from Spring Data JPA
import com.example.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for Task entities.
 * This interface provides methods for CRUD (Create, Read, Update, Delete) operations 
 * on Task entities without requiring custom implementation.
 * It extends JpaRepository, which is part of Spring Data JPA.
 */
public interface TaskRepository extends JpaRepository<Task, String> {

    /**
     * Custom query method to find tasks based on their completion status.
     * Spring Data JPA automatically implements this method based on the method name.
     *
     * @param completed The completion status to filter tasks (true for completed, false for incomplete).
     * @return A list of Task objects matching the specified completion status.
     */
    List<Task> findByCompleted(boolean completed);
}


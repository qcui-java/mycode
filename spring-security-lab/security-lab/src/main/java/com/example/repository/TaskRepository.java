package com.example.repository;

import com.example.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository for Task entities.
 */
public interface TaskRepository extends JpaRepository<Task, String> {
    /**
     * Finds tasks by completion status.
     * @param completed the completion status
     * @return the matching tasks
     */
    List<Task> findByCompleted(boolean completed);
}


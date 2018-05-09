package com.buzzmove.test.service;

import com.buzzmove.test.data.Task;
import com.buzzmove.test.repository.TaskRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class task service.
 * 
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    /**
     * Service method to save or update a task.
     * @param task Task object to save or update
     * @return Task saved or updated
     */
    public Task save(final Task task) {

        return taskRepository.save(task);

    }

    /**
     * Service method to fetch a task by id.
     * @param id Task id
     * @return Task found
     */
    public Task findById(final Integer id) {

        if (id == null) {
            return null;
        }

        return taskRepository.findOne(id);

    }

    /**
     * Service method to fetch all the tasks
     * @return List of tasks
     */
    public List<Task> findAll() {

        return taskRepository.findAll();

    }

}

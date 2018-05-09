package com.buzzmove.test.controller;

import com.buzzmove.test.data.Task;
import com.buzzmove.test.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Class task controller.
 
 */
@RestController()
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * Controller method that return a task by id.
     * @param id Task id
     * @return Task instance
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Task findById(@PathVariable("id") final Integer id) {

        return taskService.findById(id);

    }

    /**
     * Controller method that return all the tasks.
     * @return List of tasks
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Task> findAll() {

        return taskService.findAll();

    }

    /**
     * Controller method to save a new task.
     * @param task Task to save
     * @return Task saved
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Task save(@RequestBody @Valid final Task task) {

        return taskService.save(task);

    }

    /**
     * Controller method to update a task.
     * @param task Task to update
     */
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@RequestBody @Valid final Task task) {

        taskService.save(task);

    }

}

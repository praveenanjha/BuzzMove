package com.buzzmove.test.service;

import com.buzzmove.test.data.CustomerTitle;
import com.buzzmove.test.data.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Class data loader to save init data.
 * 
 */
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private TaskService taskService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        Task task = new Task();

        task.setCustomerTitle(CustomerTitle.MR);
        task.setCustomerFirstName("Nisha");
        task.setCustomerLastName("Pandey");
        task.setScheduled(new Date());

        taskService.save(task);

        task.setId(null);
        task.setCustomerTitle(CustomerTitle.MRS);
        task.setCustomerFirstName("Praveen");
        task.setCustomerLastName("Pandey");
        task.setNotes("Some Notes...");

        taskService.save(task);

        task.setId(null);
        task.setCustomerTitle(CustomerTitle.MRS);
        task.setCustomerFirstName("Amit");
        task.setCustomerLastName("Singh");

        taskService.save(task);

    }

}

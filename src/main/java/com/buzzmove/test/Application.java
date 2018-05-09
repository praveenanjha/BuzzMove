package com.buzzmove.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application initialization class.
 * 
 */
@SpringBootApplication(scanBasePackages={"com.buzzmove.test"})
@EnableAutoConfiguration
@RestController
public class Application {

    /**
     * Root controller.
     * @return Welcome message
     */
    @RequestMapping("/")
    public String index(final ModelMap modal) {

        modal.addAttribute("title","Buzzmove Test");
        return "index";
    }

    /**
     * Main method to run the application.
     * @param args Arguments Arguments to run the application
     * @throws Exception Exception
     */
    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

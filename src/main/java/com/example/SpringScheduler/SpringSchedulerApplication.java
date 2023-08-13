package com.example.SpringScheduler;

import com.example.SpringScheduler.service.ResourceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringSchedulerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringSchedulerApplication.class, args);
        ResourceService resourceService = applicationContext.getBean(ResourceService.class);

        // Fetch data from the API and save to the database
        resourceService.fetchDataAndSaveToDatabase();
    }
}

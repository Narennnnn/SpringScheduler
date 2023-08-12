package com.example.SpringScheduler;

import com.example.SpringScheduler.entities.Post;
import com.example.SpringScheduler.PostRepository;
import com.example.SpringScheduler.service.ResourceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringSchedulerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringSchedulerApplication.class, args);
		PostRepository postRepository = applicationContext.getBean(PostRepository.class);
		ResourceService resourceService = applicationContext.getBean(ResourceService.class);

		// Fetch data from the API
		List<Post> posts = resourceService.getAllData();

		// Save each post to the database
		for (Post post : posts) {
			postRepository.save(post);
		}
	}
}

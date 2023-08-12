package com.example.SpringScheduler.service;

import com.example.SpringScheduler.model.Post;
import com.example.SpringScheduler.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final String apiUrl = "https://jsonplaceholder.typicode.com";

    private final RestTemplate restTemplate;
    private final PostRepository postRepository;

    @Autowired
    public ApiServiceImpl(RestTemplate restTemplate, PostRepository postRepository) {
        this.restTemplate = restTemplate;
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> fetchPosts() {
        // Fetch posts from the API and return them
        List<Post> posts = restTemplate.getForObject(apiUrl + "/posts", List.class);
        return posts;
    }

    @Override
    public void savePosts(List<Post> posts) {
        // Save the fetched posts to the database
        postRepository.saveAll(posts);
    }
}

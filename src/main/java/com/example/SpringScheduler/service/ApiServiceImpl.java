package com.example.SpringScheduler.service;

import com.example.SpringScheduler.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final String apiUrl = "https://jsonplaceholder.typicode.com";

    private final RestTemplate restTemplate;

    @Autowired
    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Post> fetchPosts() {
        List<Post> posts = new ArrayList<>();
        try {
            Post[] postsArray = restTemplate.getForObject(apiUrl + "/posts", Post[].class);
            if (postsArray != null) {
                posts.addAll(Arrays.asList(postsArray));
            }
        } catch (HttpClientErrorException ex) {
            if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
                System.err.println("Resource not found: " + ex.getStatusText());
            } else {
                System.err.println("HTTP error: " + ex.getStatusCode() + " - " + ex.getStatusText());
            }
        } catch (Exception e) {
            System.err.println("Error fetching posts: " + e.getMessage());
        }
        return posts;
    }
}

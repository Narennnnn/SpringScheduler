package com.example.SpringScheduler.service;

import com.example.SpringScheduler.entities.Post; // Import the Post class
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.http.HttpStatus;

import java.util.Arrays; // Import for Arrays
import java.util.List; // Import for List

@Service
@Slf4j
public class ResourceService {
    final static String url = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    public List<Post> getAllData() {
        try {
            ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Post[].class);
            List<Post> posts = Arrays.asList(response.getBody()); // Convert array to List
            log.info("Fetched {} posts", posts.size());
            return posts;
        } catch (Exception e) {
            log.error("Something went wrong!", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling endpoint of API",
                    e
            );
        }
    }
}

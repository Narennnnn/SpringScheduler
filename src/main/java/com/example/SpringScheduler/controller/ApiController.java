package com.example.SpringScheduler.controller;

import com.example.SpringScheduler.model.Post;
import com.example.SpringScheduler.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/fetchAndSavePosts")
    public void fetchAndSavePosts() {
        List<Post> posts = apiService.fetchPosts();
        apiService.savePosts(posts);
    }
}

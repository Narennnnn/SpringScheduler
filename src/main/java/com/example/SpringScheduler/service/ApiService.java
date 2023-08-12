package com.example.SpringScheduler.service;

import com.example.SpringScheduler.model.Post;

import java.util.List;

public interface ApiService {
    List<Post> fetchPosts();
    void savePosts(List<Post> posts);
}

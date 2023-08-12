package com.example.SpringScheduler.repository;

import com.example.SpringScheduler.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    // You can add custom query methods here if needed
}

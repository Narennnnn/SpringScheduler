package com.example.SpringScheduler;

import com.example.SpringScheduler.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Post,Integer> {
}

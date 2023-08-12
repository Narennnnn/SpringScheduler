package com.example.SpringScheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.http.HttpStatus;

@Service
@Slf4j
public class ResourceService {
    final static String url = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;


    public Object getAllData() {
        try {
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
            log.info(response.getBody());
            return response.getBody();
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

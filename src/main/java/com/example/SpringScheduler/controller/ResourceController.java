package com.example.SpringScheduler.controller;

import com.example.SpringScheduler.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringScheduler")
@RequiredArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    @GetMapping(value = "/get-all-fake-posts")
    public ResponseEntity<?> callRapidEndPointToGetFakePosts() {
        return ResponseEntity.ok(resourceService.getAllData());
    }
}

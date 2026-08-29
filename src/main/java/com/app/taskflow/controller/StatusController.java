package com.app.taskflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping("/test-get-status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Application is running");
    }
}
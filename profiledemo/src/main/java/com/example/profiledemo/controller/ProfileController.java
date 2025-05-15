package com.example.profiledemo.controller;

import com.example.profiledemo.service.EnvironmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final EnvironmentService environmentService;

    public ProfileController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    @GetMapping("/env")
    public String getEnvironment() {
        return environmentService.getEnvironmentMessage();
    }
}


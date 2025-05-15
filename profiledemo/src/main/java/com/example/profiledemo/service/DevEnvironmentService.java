package com.example.profiledemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironmentMessage() {
        return "This is the DEVELOPMENT environment.";
    }
}


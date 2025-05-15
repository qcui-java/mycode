package com.example.profiledemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironmentMessage() {
        return "This is the PRODUCTION environment.";
    }
}


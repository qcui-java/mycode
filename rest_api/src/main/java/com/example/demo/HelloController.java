package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    // Endpoint 1: Basic Greeting with Path Variable
    @GetMapping("/hello/{name}")
    public Map<String, String> helloWithName(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        return response;
    }

    // Endpoint 2: Query Parameter Example
    @GetMapping("/greet")
    public Map<String, String> greetWithQuery(@RequestParam(defaultValue = "Guest") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greetings, " + name + "!");
        return response;
    }

    // Endpoint 3: Simple Status Check (Static Response)
    @GetMapping("/status")
    public Map<String, String> statusCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "Application is running");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }

    // Endpoint 4: Create User (POST Request with JSON)
    @PostMapping("/user")
    public Map<String, Object> createUser(@RequestBody Map<String, String> user) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "User created successfully");
        response.put("userDetails", user);
        return response;
    }
}


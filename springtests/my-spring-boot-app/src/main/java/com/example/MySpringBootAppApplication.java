package com.example; // Make sure this line is correct

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootAppApplication { // Verify this class name EXACTLY

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAppApplication.class, args);
    }
}


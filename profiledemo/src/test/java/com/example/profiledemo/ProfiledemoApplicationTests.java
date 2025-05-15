package com.example.profiledemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles; // <-- Add this import

@SpringBootTest
@ActiveProfiles("dev") // <-- Add this annotation to activate the "dev" profile for tests
class ProfiledemoApplicationTests {

    @Test
    void contextLoads() {
        // This test simply checks if the application context can load successfully.
    }

}


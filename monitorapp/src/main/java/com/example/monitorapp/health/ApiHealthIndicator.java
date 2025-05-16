package com.example.monitorapp.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ApiHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean externalServiceRunning = checkFakeExternalService();
        if (externalServiceRunning) {
            return Health.up().withDetail("externalService", "Available").build();
        } else {
            return Health.down().withDetail("externalService", "Unavailable").build();
        }
    }

    private boolean checkFakeExternalService() {
        // Simulate a check: return false to simulate failure
        return true;
    }
}


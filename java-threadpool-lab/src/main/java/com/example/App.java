package com.example;

import com.example.model.Order;
import com.example.service.OrderManager;

/**
 * Demonstrates thread pools with order processing.
 */
public class App {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager(3); // 3 threads
        manager.processOrder(new Order("001", 100.0));
        manager.processOrder(new Order("002", 200.0));
        manager.processOrder(new Order("003", -50.0)); // Invalid order
        manager.processOrder(new Order("004", 150.0));

        // Wait briefly to see output
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted");
        }

        manager.shutdown();
        System.out.println("Orders submitted: " + manager.getOrders());
    }
}


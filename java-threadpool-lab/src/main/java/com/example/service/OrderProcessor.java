package com.example.service;

import com.example.exception.OrderProcessingException;
import com.example.model.Order;

/**
 * Processes an order in a separate thread.
 */
public class OrderProcessor implements Runnable {
    private Order order;

    /**
     * Constructs an OrderProcessor for the given order.
     * @param order the order to process
     */
    public OrderProcessor(Order order) {
        this.order = order;
    }

    /**
     * Processes the order, simulating work.
     */
    @Override
    public void run() {
        try {
            if (order.getAmount() <= 0) {
                throw new OrderProcessingException("Invalid order amount: " + order.getAmount());
            }
            // Simulate processing time
            Thread.sleep(1000);
            System.out.println("Processed " + order + " on thread " + Thread.currentThread().getName());
        } catch (InterruptedException | OrderProcessingException e) {
            System.err.println("Error processing " + order + ": " + e.getMessage());
        }
    }
}


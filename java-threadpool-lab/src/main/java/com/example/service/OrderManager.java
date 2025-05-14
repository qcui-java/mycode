package com.example.service;

import com.example.model.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Manages order processing using a thread pool.
 */
public class OrderManager {
    private ExecutorService executorService;
    private List<Order> orders;

    /**
     * Constructs an OrderManager with a fixed thread pool.
     * @param poolSize the number of threads in the pool
     */
    public OrderManager(int poolSize) {
        this.executorService = Executors.newFixedThreadPool(poolSize);
        this.orders = new ArrayList<>();
    }

    /**
     * Submits an order for processing.
     * @param order the order to process
     */
    public void processOrder(Order order) {
        orders.add(order);
        executorService.submit(new OrderProcessor(order));
    }

    /**
     * Shuts down the thread pool gracefully.
     */
    public void shutdown() {
        executorService.shutdown();
    }

    /**
     * Gets the list of submitted orders.
     * @return the orders
     */
    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }
}


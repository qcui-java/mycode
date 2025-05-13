package com.example.main;

import com.example.model.Product;
import com.example.service.InventoryService;

/**
 * Entry point to demonstrate clean code practices.
 */
public class Main {
    public static void main(String[] args) {
        // Create a product with clear variable names
        Product laptop = new Product("Laptop", 999.99);
        InventoryService inventoryService = new InventoryService();

        // Test with a specific quantity
        int quantity = 3;
        String summary = inventoryService.getProductSummary(laptop, quantity);
        System.out.println(summary);
    }
}


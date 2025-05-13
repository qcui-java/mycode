package com.example.service;

import com.example.model.Product;

/**
 * Manages inventory operations for products.
 * Demonstrates clean code with small, focused methods.
 */
public class InventoryService {
    /**
     * Calculates the total value of a product based on quantity.
     * @param product the product to evaluate
     * @param quantity the number of units
     * @return the total value (price * quantity)
     */
    public double calculateTotalValue(Product product, int quantity) {
        if (quantity < 0) {
            return 0.0;
        }
        return product.getUnitPrice() * quantity;
    }

    /**
     * Generates a summary of the product and its total value.
     * @param product the product to summarize
     * @param quantity the number of units
     * @return a formatted summary string
     */
    public String getProductSummary(Product product, int quantity) {
        double totalValue = calculateTotalValue(product, quantity);
        return String.format("Product: %s, Quantity: %d, Total Value: $%.2f",
                product.getProductName(), quantity, totalValue);
    }
}


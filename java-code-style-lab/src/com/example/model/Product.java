package com.example.model;

/**
 * Represents a product with a name and price.
 * Used to demonstrate clean code and naming conventions.
 */
public class Product {
    private String productName;
    private double unitPrice;

    /**
     * Constructs a Product with the specified name and price.
     * @param productName the name of the product
     * @param unitPrice the price per unit
     */
    public Product(String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    /**
     * Gets the product name.
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Gets the unit price.
     * @return the unit price
     */
    public double getUnitPrice() {
        return unitPrice;
    }
}


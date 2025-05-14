package com.example.model;

/**
 * Represents an order with an ID and amount.
 */
public class Order {
    private String id;
    private double amount;

    /**
     * Constructs an Order with the given ID and amount.
     * @param id the order ID
     * @param amount the order amount
     */
    public Order(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    /**
     * Gets the order ID.
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the order amount.
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns a string representation of the order.
     * @return the order details
     */
    @Override
    public String toString() {
        return "Order{id='" + id + "', amount=" + amount + "}";
    }
}


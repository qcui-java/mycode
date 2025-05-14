package com.example.model;

/**
 * Represents a rectangle with width and height.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Constructs a Rectangle with the given width and height.
     * @param width the rectangle's width. Must be positive.
     * @param height the rectangle's height. Must be positive.
     * @throws IllegalArgumentException if width or height are not positive.
     */
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle (width * height).
     * @return the area
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle (2 * (width + height)).
     * @return the perimeter
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Optional: getters if needed for other types of tests or usage
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}


package com.example.model;

/**
 * Represents a circle with a radius, extending AbstractShape.
 */
public class Circle extends AbstractShape {
    private double radius;

    /**
     * Constructs a Circle with the given radius.
     * @param radius the circle's radius
     */
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle (π * radius^2).
     * @return the area
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle (2 * π * radius).
     * @return the perimeter
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


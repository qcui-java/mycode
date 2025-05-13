package com.example.model;

/**
 * Represents a rectangle with width and height, extending AbstractShape.
 */
public class Rectangle extends AbstractShape {
    private double width;
    private double height;

    /**
     * Constructs a Rectangle with the given width and height.
     * @param width the rectangle's width
     * @param height the rectangle's height
     */
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle (width * height).
     * @return the area
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle (2 * (width + height)).
     * @return the perimeter
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}


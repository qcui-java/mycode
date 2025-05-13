package com.example.model;

/**
 * Abstract base class for shapes, providing common attributes and requiring area/perimeter methods.
 */
public abstract class AbstractShape implements Shape {
    private String name;

    /**
     * Constructs an AbstractShape with the given name.
     * @param name the shape's name
     */
    public AbstractShape(String name) {
        this.name = name;
    }

    /**
     * Gets the shape's name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the shape.
     * @return the shape details
     */
    @Override
    public String toString() {
        return name + " [Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}


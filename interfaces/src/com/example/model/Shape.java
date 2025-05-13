package com.example.model;

/**
 * Defines common behavior for shapes, such as calculating area and perimeter.
 */
public interface Shape {
    /**
     * Calculates the area of the shape.
     * @return the area
     */
    double calculateArea();

    /**
     * Calculates the perimeter of the shape.
     * @return the perimeter
     */
    double calculatePerimeter();
}


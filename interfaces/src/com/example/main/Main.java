package com.example.main;

import com.example.model.Circle;
import com.example.model.Rectangle;
import com.example.model.Shape;

/**
 * Demonstrates the use of interfaces and abstract classes with shapes.
 */
public class Main {
    public static void main(String[] args) {
        // Create shapes using polymorphism
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display shape details
        System.out.println(circle);
        System.out.println(rectangle);

        // Use interface methods directly
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}


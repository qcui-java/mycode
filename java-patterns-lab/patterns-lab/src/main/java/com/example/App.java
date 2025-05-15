package com.example;

import com.example.exception.PatternException;
import com.example.factory.Shape;
import com.example.factory.ShapeFactory;
import com.example.singleton.ConfigurationManager;

/**
 * Demonstrates Singleton and Factory design patterns.
 */
public class App {
    public static void main(String[] args) {
        try {
            // Singleton: Get configuration (Day 1 OOP, Day 2 collections)
            ConfigurationManager config = ConfigurationManager.getInstance();
            System.out.println("App Name: " + config.getConfig("appName"));
            System.out.println("Version: " + config.getConfig("version"));

            // Verify Singleton (same instance)
            ConfigurationManager config2 = ConfigurationManager.getInstance();
            System.out.println("Is same instance? " + (config == config2));

            // Factory: Create shapes (Day 1 polymorphism, Day 2 exceptions)
            ShapeFactory factory = new ShapeFactory();
            Shape circle = factory.createShape("circle");
            Shape rectangle = factory.createShape("rectangle");
            System.out.println(circle.draw());
            System.out.println(rectangle.draw());

        } catch (PatternException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


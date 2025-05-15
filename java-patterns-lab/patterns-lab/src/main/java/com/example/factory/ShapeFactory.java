package com.example.factory;

import com.example.exception.PatternException;

/**
 * Factory for creating Shape objects.
 */
public class ShapeFactory {
    /**
     * Creates a shape based on the given type.
     * @param type the shape type
     * @return the shape
     * @throws PatternException if the type is invalid
     */
    public Shape createShape(String type) throws PatternException {
        if (type == null || type.trim().isEmpty()) {
            throw new PatternException("Shape type cannot be empty");
        }
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                throw new PatternException("Unknown shape type: " + type);
        }
    }
}


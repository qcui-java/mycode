package com.example.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for the Rectangle class.
 */
public class RectangleTest {

    @Test
    @DisplayName("Should calculate area correctly for valid dimensions")
    void testCalculateArea_PositiveDimensions() {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double expectedArea = 24.0;
        // Using a delta for double comparisons is good practice, though may not be strictly needed for simple multiplication
        assertEquals(expectedArea, rectangle.calculateArea(), 0.001, "Area should be width * height");
    }

    @Test
    @DisplayName("Should calculate perimeter correctly for valid dimensions")
    void testCalculatePerimeter_PositiveDimensions() {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double expectedPerimeter = 20.0;
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), 0.001, "Perimeter should be 2 * (width + height)");
    }

    @Test
    @DisplayName("Constructor should throw IllegalArgumentException for zero width")
    void testConstructor_ZeroWidth_ThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(0, 5.0);
        });
        assertEquals("Width and height must be positive.", exception.getMessage());
    }

    @Test
    @DisplayName("Constructor should throw IllegalArgumentException for negative height")
    void testConstructor_NegativeHeight_ThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(5.0, -2.0);
        });
        assertEquals("Width and height must be positive.", exception.getMessage());
    }
}


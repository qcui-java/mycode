package com.example.service;

import com.example.exception.InventoryException;
import com.example.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the BookInventory class.
 */
public class BookInventoryTest {
    private BookInventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new BookInventory();
    }

    @Test
    @DisplayName("Should add a book successfully")
    void testAddBook() throws InventoryException {
        inventory.addBook("1984", "George Orwell");
        assertEquals(1, inventory.getBooks().size(), "Book should be added");
        Book book = inventory.getBooks().get(0);
        assertEquals("1984", book.getTitle(), "Title should match");
        assertEquals("George Orwell", book.getAuthor(), "Author should match");
    }

    @Test
    @DisplayName("Should throw exception for duplicate book")
    void testAddDuplicateBook() throws InventoryException {
        inventory.addBook("1984", "George Orwell");
        InventoryException exception = assertThrows(InventoryException.class,
                () -> inventory.addBook("1984", "George Orwell"),
                "Should throw exception for duplicate book");
        assertEquals("Book already exists: 1984 by George Orwell", exception.getMessage(),
                "Exception message should match");
    }

    @Test
    @DisplayName("Should remove a book successfully")
    void testRemoveBook() throws InventoryException {
        inventory.addBook("1984", "George Orwell");
        inventory.removeBook("1984");
        assertEquals(0, inventory.getBooks().size(), "Book should be removed");
    }
}


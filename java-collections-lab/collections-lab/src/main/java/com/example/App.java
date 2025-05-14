package com.example;

import com.example.exception.InventoryException;
import com.example.service.BookInventory;

/**
 * Demonstrates the BookInventory application.
 */
public class App {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();
        try {
            // try adding a book to our inventory object
            inventory.addBook("1984", "George Orwell");
            inventory.addBook("Brave New World", "Aldous Huxley");
            
            System.out.println("Books: " + inventory.getBooks());
            
            // try removing a book from our inventory
            inventory.removeBook("1984");
            
            System.out.println("After removal: " + inventory.getBooks());
        } catch (InventoryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


package com.example.service;

import com.example.exception.InventoryException;
import com.example.model.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages a collection of books.
 */
public class BookInventory {
    private List<Book> books;

    /**
     * Constructs an empty BookInventory.
     */
    public BookInventory() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the inventory.
     * @param title the book title
     * @param author the book author
     * @throws InventoryException if the book already exists or inputs are invalid
     */
    public void addBook(String title, String author) throws InventoryException {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            throw new InventoryException("Title and author must not be empty");
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                throw new InventoryException("Book already exists: " + title + " by " + author);
            }
        }
        books.add(new Book(title, author));
    }

    /**
     * Removes a book by title.
     * @param title the book title
     * @throws InventoryException if the book is not found
     */
    public void removeBook(String title) throws InventoryException {
        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        if (!removed) {
            throw new InventoryException("Book not found: " + title);
        }
    }

    /**
     * Gets the current list of books.
     * @return the list of books
     */
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}


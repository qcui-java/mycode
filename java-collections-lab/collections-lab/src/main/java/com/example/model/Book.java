package com.example.model;

/**
 * Represents a book with a title and author.
 */
public class Book {
    private String title;
    private String author;

    /**
     * Constructs a Book with the given title and author.
     * @param title the book title
     * @param author the book author
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Gets the book title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the book author.
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns a string representation of the book.
     * @return the book details
     */
    @Override
    public String toString() {
        return title + " by " + author;
    }
}


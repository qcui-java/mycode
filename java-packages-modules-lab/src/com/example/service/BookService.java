package com.example.service;

import com.example.model.Book;

public class BookService {
    public String getBookSummary(Book book) {
        return "Book: " + book.getTitle() + ", Price: $" + book.getPrice();
    }
}


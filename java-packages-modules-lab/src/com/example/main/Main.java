package com.example.main;

import com.example.model.Book;
import com.example.service.BookService;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", 29.99);
        BookService service = new BookService();
        System.out.println(service.getBookSummary(book));
    }
}


package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService bean created.");

        if (bookRepository != null) {
            System.out.println("BookRepository injected successfully.");
            bookRepository.displayRepository();
        }
    }
}
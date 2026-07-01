package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService bean created.");

        if (bookRepository != null) {
            System.out.println("BookRepository has been injected successfully.");
            bookRepository.displayRepository();
        } else {
            System.out.println("BookRepository is not injected.");
        }
    }
}

package com.example.librarymanagementf.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.librarymanagementf.entity.Book;

public interface BookRepositary extends JpaRepository<Book, Long> {
}

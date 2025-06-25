package com.explore_project.book_management_backend.dao;

import com.explore_project.book_management_backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}

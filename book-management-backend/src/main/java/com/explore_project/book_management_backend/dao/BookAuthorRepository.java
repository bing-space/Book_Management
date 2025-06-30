package com.explore_project.book_management_backend.dao;

import com.explore_project.book_management_backend.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// Name of JSON entry: bookauthor
// URL: /book-author
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookAuthor", path="book-author")
public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {

}

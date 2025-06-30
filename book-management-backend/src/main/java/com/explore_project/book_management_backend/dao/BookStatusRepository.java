package com.explore_project.book_management_backend.dao;

import com.explore_project.book_management_backend.entity.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookStatus", path="book-status")
public interface BookStatusRepository extends JpaRepository<BookStatus, Long> {
}

package com.explore_project.book_management_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="book_author")
@Getter
@Setter
public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "author")
    private String author;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private Set<Book> books;

}

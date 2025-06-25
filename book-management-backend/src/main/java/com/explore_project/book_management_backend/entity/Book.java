package com.explore_project.book_management_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="author_id", referencedColumnName = "id", nullable=false)
    private BookAuthor author;

    @ManyToOne
    @JoinColumn(name="status_id", referencedColumnName = "id", nullable=false)
    private BookStatus status;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "date_add")
    @CreationTimestamp
    private Date dateAdd;

    @Column(name = "date_finish")
    @UpdateTimestamp
    private Date dateFinish;

    @Transient
    private String statusType;

    @Transient
    private String authorName;

    public String getAuthorName(){
        return author.getAuthor();
    }

    public String getStatusType(){
        return status.getStatus();
    }

}

package com.example.onetomanydemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private double price;
    private String genre;
    @JoinTable(name = "book_author",
            joinColumns =
                    @JoinColumn(name = "book_id",referencedColumnName = "id"),
            inverseJoinColumns =
                    @JoinColumn(name = "author_id",referencedColumnName = "id")
    )
    @ManyToOne
    private Author author;

    public Book(String title, double price, String genre) {
        this.title = title;
        this.price = price;
        this.genre = genre;
    }

    public Book(){

    }

}

package com.example.onetomanydemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.PERSIST,orphanRemoval = true,
    mappedBy = "author")
    private List<Book> books=
            new LinkedList<>();

    public void removeBook(Book book){
        book.setAuthor(null);
        books.remove(book);
    }

    public  void addBook(Book book){
        book.setAuthor(this);
        this.books.add(book);
    }













}

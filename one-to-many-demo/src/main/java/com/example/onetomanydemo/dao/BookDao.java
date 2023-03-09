package com.example.onetomanydemo.dao;

import com.example.onetomanydemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}

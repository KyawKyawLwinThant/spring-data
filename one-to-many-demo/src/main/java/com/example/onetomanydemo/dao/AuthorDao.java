package com.example.onetomanydemo.dao;

import com.example.onetomanydemo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorDao extends JpaRepository<Author,Integer> {
    @Query("""
select a from Author a join fetch a.books where a.name=?1
""")
    public Author findAuthorByName(String name);
}

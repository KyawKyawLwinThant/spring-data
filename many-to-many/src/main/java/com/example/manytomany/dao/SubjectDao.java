package com.example.manytomany.dao;

import com.example.manytomany.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository<Subject,Integer> {
}

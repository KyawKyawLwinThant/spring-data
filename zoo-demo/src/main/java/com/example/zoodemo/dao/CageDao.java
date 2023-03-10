package com.example.zoodemo.dao;

import com.example.zoodemo.entity.Cage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageDao extends JpaRepository<Cage,Integer> {
}

package com.example.jpaex.dao;

import com.example.jpaex.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Integer> {
}

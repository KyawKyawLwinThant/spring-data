package com.example.inheritancedemo.dao;

import com.example.inheritancedemo.entity.HourlyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HourlyEmployeeDao extends JpaRepository<HourlyEmployee,Integer> {
}

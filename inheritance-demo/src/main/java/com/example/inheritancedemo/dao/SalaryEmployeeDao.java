package com.example.inheritancedemo.dao;

import com.example.inheritancedemo.entity.SalariedEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryEmployeeDao extends JpaRepository<SalariedEmployee,Integer> {
}

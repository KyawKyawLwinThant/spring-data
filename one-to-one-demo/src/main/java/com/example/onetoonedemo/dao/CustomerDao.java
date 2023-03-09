package com.example.onetoonedemo.dao;

import com.example.onetoonedemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}

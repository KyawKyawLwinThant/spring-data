package com.example.springjpaelementcollection.dao;

import com.example.springjpaelementcollection.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}

package com.example.inheritancedemo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue("salary")
@Table(name = "salary_employee")
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name,String email,double salary){
        super(name,email);
        this.salary=salary;
    }

    public SalariedEmployee(){

    }
}

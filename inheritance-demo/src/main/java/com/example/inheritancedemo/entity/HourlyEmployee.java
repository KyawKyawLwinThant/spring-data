package com.example.inheritancedemo.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue("Hourly")
@Table(name = "hourly_employee")
public class HourlyEmployee extends Employee{
    private double rate;
    private int hours;
    public HourlyEmployee(){

    }
    public HourlyEmployee(String name,String email,double rate,int hours){
        super(name,email);
        this.rate=rate;
        this.hours=hours;
    }
}

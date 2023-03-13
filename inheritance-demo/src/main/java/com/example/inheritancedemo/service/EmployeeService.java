package com.example.inheritancedemo.service;

import com.example.inheritancedemo.dao.HourlyEmployeeDao;
import com.example.inheritancedemo.dao.SalaryEmployeeDao;
import com.example.inheritancedemo.entity.HourlyEmployee;
import com.example.inheritancedemo.entity.SalariedEmployee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final SalaryEmployeeDao salaryEmployeeDao;
    private final HourlyEmployeeDao hourlyEmployeeDao;

    public EmployeeService(SalaryEmployeeDao salaryEmployeeDao, HourlyEmployeeDao hourlyEmployeeDao) {
        this.salaryEmployeeDao = salaryEmployeeDao;
        this.hourlyEmployeeDao = hourlyEmployeeDao;
    }
    @Transactional
    public void createDb(){
        SalariedEmployee s1=new SalariedEmployee("John Doe","john@gmail.com",2000);
        SalariedEmployee s2=new SalariedEmployee("John William","william@gmail.com",3000);
        HourlyEmployee h1=new HourlyEmployee("Thomas Hardy","thomas@gmail.com",200,60);
        HourlyEmployee h2=new HourlyEmployee("Richard Chan","richahrd@gmail.com",300,50);
        hourlyEmployeeDao.save(h1);
        hourlyEmployeeDao.save(h2);
        salaryEmployeeDao.save(s1);
        salaryEmployeeDao.save(s2);

    }







}

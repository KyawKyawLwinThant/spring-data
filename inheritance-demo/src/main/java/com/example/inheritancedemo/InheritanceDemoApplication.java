package com.example.inheritancedemo;

import com.example.inheritancedemo.service.EmployeeService;
import com.example.inheritancedemo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceDemoApplication implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(InheritanceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.createDb();
       // JPAUtil.checkData("select * from employee");
        JPAUtil.checkData("select * from hourly_employee");
        JPAUtil.checkData("select * from salary_employee");
    }
}

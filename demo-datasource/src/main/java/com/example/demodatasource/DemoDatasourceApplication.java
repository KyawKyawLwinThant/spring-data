package com.example.demodatasource;

import com.example.demodatasource.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDatasourceApplication implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(DemoDatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.listEmail()
                .forEach(System.out::println);
    }
}

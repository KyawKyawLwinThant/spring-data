package com.example.singleworkunit.service;


import com.example.singleworkunit.dao.EmployeeDao;
import com.example.singleworkunit.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void createEmployeeWithTransaction(){
        createEmployees();

    }
    public void createEmployeeWithoutTransaction(){
        createEmployees();
    }
    public void deleteAllEmployee(){
        employeeDao.deleteAllEmployee();
    }

    public List<Employee> listAllEmoloyee(){
        return employeeDao.listAllEmployee();
    }

    private void createEmployees() {
        employeeDao.createEmployee(new Employee(12,"Thuza",
                "Nwe","new@gmail.com",2000));
        employeeDao.createEmployee(new Employee(13,"Khaing",
                "Thuza","khaing@gmail.com",2000));
        employeeDao.createEmployee(new Employee(-14,"Thu Thu",
                "Thaw","thuthu@gmail.com",2000));
        employeeDao.createEmployee(new Employee(15,"Thaw Thaw",
                "Htun Zin","thawthaw@gmail.com",2000));
    }
}

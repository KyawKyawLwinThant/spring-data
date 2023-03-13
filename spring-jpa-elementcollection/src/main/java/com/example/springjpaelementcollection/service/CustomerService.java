package com.example.springjpaelementcollection.service;

import com.example.springjpaelementcollection.dao.CustomerDao;
import com.example.springjpaelementcollection.entity.Customer;
import com.example.springjpaelementcollection.entity.Phone;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    @Transactional
    public void createDb(){
        Customer customer1=new Customer("John Doe","3333333");
        Customer customer2=new Customer("John William","5555555");
        Customer customer3=new Customer("Thomas Hardy","66666666");

        customer3.addAddress("Creek Bridge Road");
        customer3.addAddress("Dream Land");
        customer3.addAddress("Love Lane");
        customer3.addEmail("john@gmail.com");
        customer3.addEmail("doe@gmail.com");

        customer1.addPhoneNumber(new Phone("55-55-555","MPT","Apple"));
        customer1.addPhoneNumber(new Phone("66-66-666","Oredoo","Sony"));
        customer1.addAddress("79 Park Avenue");
        customer1.addAddress("11 Strand Road");
        customer1.addEmail("william@gmail.com");
        customer1.addEmail("williamson@gmail.com");


        customer2.addEmail("hardy@gmail.com");
        customer2.addEmail("thomas@gmail.com");
        customer2.addAddress("blue lagoon road");
        customer2.addAddress("sky blue creek");
        customer2.addPhoneNumber(new Phone("66-666-666","MPT","Samsung"));
        customer2.addPhoneNumber(new Phone("33-333-333","MPT","Sony"));

        customerDao.save(customer1);
        customerDao.save(customer2);
        customerDao.save(customer3);


    }

}

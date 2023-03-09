package com.example.onetoonedemo.service;

import com.example.onetoonedemo.dao.AddressDao;
import com.example.onetoonedemo.dao.CustomerDao;
import com.example.onetoonedemo.entity.Address;
import com.example.onetoonedemo.entity.Customer;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerDao customerDao;
    private final AddressDao addressDao;

    public CustomerService(CustomerDao customerDao, AddressDao addressDao) {
        this.customerDao = customerDao;
        this.addressDao = addressDao;
    }
    public Customer findCustomerById(int id){
        return customerDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
    @Transactional
    public void createDb(){
        Customer customer1=
                new Customer("John Doe","55-555-55","john@gmail.com");
        Customer customer2=
                new Customer("Thomas Hardy","66-666-66","hardy@gmail.com");
        Address address1=new Address("Bridge Creek Road","NO.87","Yangon");
        Address address2=new Address("Dream Land","No.11","Yangon");
        //mapping
        address1.setCustomer(customer1);
        address2.setCustomer(customer2);
        customer1.setAddress(address1);
        customer2.setAddress(address2);


        customerDao.save(customer1);
        customerDao.save(customer2);
        addressDao.save(address1);
        addressDao.save(address2);








    }
}

package com.example.onetoonedemo;

import com.example.onetoonedemo.entity.Customer;
import com.example.onetoonedemo.service.CustomerService;
import com.example.onetoonedemo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.createDb();
        Customer customer=customerService.findCustomerById(1);
        System.out.println(
                String.format("%s lives in %s.",
                        customer.getName(),customer.getAddress().getCity())
        );
        JPAUtil.checkData("select * from customer");
        JPAUtil.checkData("select * from address");
    }
}

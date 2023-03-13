package com.example.springjpaelementcollection;

import com.example.springjpaelementcollection.service.CustomerService;
import com.example.springjpaelementcollection.util.JPAUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaElementcollectionApplication {
    private final CustomerService customerService;

    public SpringJpaElementcollectionApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return r ->{
            customerService.createDb();
            JPAUtil.checkData("select * from customer");
            JPAUtil.checkData("select * from customer_phones");
            JPAUtil.checkData("select * from customer_emails");
            JPAUtil.checkData("select * from customer_addresses");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaElementcollectionApplication.class, args);
    }

}

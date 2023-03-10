package com.example.zoodemo;

import com.example.zoodemo.service.ZooService;
import com.example.zoodemo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooDemoApplication implements CommandLineRunner {
    @Autowired
    private ZooService zooService;
    public static void main(String[] args) {
        SpringApplication.run(ZooDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        zooService.createDb();
        JPAUtil.checkData("select * from cage");
        JPAUtil.checkData("select * from animal");
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from supplier");
        JPAUtil.checkData("select * from food_item");
        JPAUtil.checkData("select * from animal_food_items");


    }
}

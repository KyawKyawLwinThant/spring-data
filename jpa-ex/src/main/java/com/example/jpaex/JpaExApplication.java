package com.example.jpaex;

import com.example.jpaex.service.CarService;
import com.example.jpaex.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaExApplication implements CommandLineRunner {
    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(JpaExApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        carService.createDb();
        JPAUtil.checkData("select * from car");
        JPAUtil.checkData("select * from company");
        JPAUtil.checkData("select * from insurance");
        JPAUtil.checkData("select * from manufacturer");
        JPAUtil.checkData("select * from person");
        JPAUtil.checkData("select * from car_insurence");
        JPAUtil.checkData("select * from driver_car");
    }
}

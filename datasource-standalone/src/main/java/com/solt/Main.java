package com.solt;

import com.solt.service.EmployeeDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeDao employeeDao=context.getBean(EmployeeDao.class);
        employeeDao.listEmail()
                .forEach(System.out::println);
    }
}

package com.example.onetomanydemo;

import com.example.onetomanydemo.service.BookService;
import com.example.onetomanydemo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyDemoApplication implements CommandLineRunner {
    @Autowired
    private BookService bookService;
    public static void main(String[] args) {
        SpringApplication.run(OneToManyDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookService.saveAuthorWithThreeBooks();
        bookService.newThreeBooksWithoutAuthor();
/*        System.out.println("-----------------------------------------------------");
        bookService.addNewBookWithExistingAuthor();
        System.out.println("-----------------------------------------------------");
        bookService.removeFirstBookFromExistingAuthor();
        System.out.println("-----------------------------------------------------");
        bookService.removeLastBookFromExistingAuthor();
        System.out.println("-----------------------------------------------------");*/
        JPAUtil.checkData("select * from author");
        JPAUtil.checkData("select * from book");
        JPAUtil.checkData("select * from book_author");
    }
}

package com.solt.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeDao {

     private JdbcTemplate jdbcTemplate;

     public EmployeeDao(DataSource dataSource){
         jdbcTemplate=new JdbcTemplate();
         jdbcTemplate.setDataSource(dataSource);
     }

     public List<String> listEmail(){
         return jdbcTemplate
                 .queryForList("select email from employee",
                 String.class);
     }

}

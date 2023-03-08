package com.example.democonnectionjdbc.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
}

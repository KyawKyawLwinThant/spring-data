package com.example.jpaex.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Company extends IdClass{

    private String name;
    @Embedded
    private Address address;

    public Company(){

    }

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

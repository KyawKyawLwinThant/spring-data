package com.example.jpaex.entity;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    private String streetName;
    private String streetNum;
    private String city;

    public Address(){

    }

    public Address(String streetName, String streetNum, String city) {
        this.streetName = streetName;
        this.streetNum = streetNum;
        this.city = city;
    }
}

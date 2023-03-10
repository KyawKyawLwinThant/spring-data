package com.example.zoodemo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cage extends IdClass{

    private String cageNo;
    private String location;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Animal animal;
    public Cage(){

    }

    public Cage(String cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }
}

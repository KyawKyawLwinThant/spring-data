package com.example.jpaex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Person extends IdClass{
    private String name;
    private LocalDate dob;
    @JoinColumn(name = "car_id_fk")
    @ManyToOne
    private Car car1;
    @JoinTable(
            name = "driver_car",
            joinColumns =
                    @JoinColumn(name = "driver_id",referencedColumnName = "id"),
            inverseJoinColumns =
                    @JoinColumn(name = "car_id",referencedColumnName = "id")
    )
    @ManyToOne
    private Car car2;

    public Person(){}

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
}

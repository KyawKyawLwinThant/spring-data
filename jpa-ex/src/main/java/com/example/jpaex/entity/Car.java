package com.example.jpaex.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Driver;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Car extends IdClass {
    private String model;
    private String make;
    private LocalDate year;
    private int millage;
    @OneToOne
    private CareManufacturer careManufacturer;
    @JoinTable(
            name = "car_insurence",
            joinColumns =
                    @JoinColumn(name = "car_id",referencedColumnName = "id"),
            inverseJoinColumns =
                    @JoinColumn(name = "insurence_id",referencedColumnName = "id")
    )
    @OneToOne
    private InsuranceCompany insuranceCompany;
    @OneToMany(cascade = CascadeType.PERSIST,
    mappedBy = "car1")
    private List<Person> owners=
            new ArrayList<>();
    @OneToMany(cascade = CascadeType.PERSIST,
    mappedBy = "car2")
    private List<Person> drivers=
            new ArrayList<>();


    public Car(String model, String make,LocalDate year, int millage) {
        this.model = model;
        this.make = make;
        this.year=year;
        this.millage = millage;
    }
    public void addDrivers(Person person){
        person.setCar2(this);
        drivers.add(person);
    }

    public void addOwner(Person person){
        person.setCar1(this);
        owners.add(person);
    }


    public Car(){

    }
}

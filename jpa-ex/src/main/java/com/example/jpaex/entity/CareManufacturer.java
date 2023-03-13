package com.example.jpaex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "manufacturer")
public class CareManufacturer extends Company{

    private int numberOfEmployee;
    private LocalDate yearsPublished;
    @OneToOne(mappedBy = "careManufacturer")
    private Car car;


    public CareManufacturer(String name,Address address,
                            int numberOfEmployee,LocalDate yearsPublished){
        super(name,address);
        this.numberOfEmployee=numberOfEmployee;
        this.yearsPublished=yearsPublished;
    }

    public CareManufacturer(){

    }
}

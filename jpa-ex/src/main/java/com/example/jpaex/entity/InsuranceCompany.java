package com.example.jpaex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "insurance")
public class InsuranceCompany extends Company{
    private int rating;
    @OneToOne(mappedBy = "insuranceCompany")
    private Car car;

    public InsuranceCompany(){}

    public InsuranceCompany(String name,Address address,int rating){
        super(name,address);
        this.rating=rating;
    }



}

package com.example.zoodemo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Supplier extends IdClass{
    private String supplierName;
    private String contactNo;
    private String address;
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.PERSIST)
    private List<FoodItem> foodItems=
            new ArrayList<>();

    public Supplier(String supplierName, String contactNo, String address) {
        this.supplierName = supplierName;
        this.contactNo = contactNo;
        this.address = address;
    }

    public void addFoodItem(FoodItem foodItem){
        foodItem.setSupplier(this);
        this.foodItems.add(foodItem);
    }

    public Supplier(){

    }
}

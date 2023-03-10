package com.example.zoodemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Animal extends IdClass{
    private String type;
    private int totalNo;
    @OneToOne(mappedBy = "animal")
    private Cage cage;
    @ManyToOne
    private Category category;
    @ManyToMany
    private List<FoodItem> foodItems=new ArrayList<>();

    public void addFootItem(FoodItem foodItem){
        foodItem.getAnimals().add(this);
        this.foodItems.add(foodItem);
    }


    public Animal() {
    }

    public Animal(String type, int totalNo) {
        this.type = type;
        this.totalNo = totalNo;
    }
}

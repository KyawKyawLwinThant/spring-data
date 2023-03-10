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
public class Category extends IdClass{
    private String categoryType;
    @OneToMany(mappedBy = "category",
    cascade = CascadeType.PERSIST)
    private List<Animal> animals=
            new ArrayList<>();

    public void addAnimal(Animal animal){
        animal.setCategory(this);
        this.animals.add(animal);
    }

}

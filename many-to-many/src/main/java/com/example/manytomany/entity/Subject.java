package com.example.manytomany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class Subject extends IdClass{
    private String name;
    private int duration;
    private double pice;
    @ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "subjects")
    private List<Student> students
            =new ArrayList<>();

    public Subject(String name, int duration, double pice) {
        this.name = name;
        this.duration = duration;
        this.pice = pice;
    }

    public void addStudent(Student student){
        student.getSubjects().add(this);
        this.students.add(student);
    }

    public Subject(){

    }

}

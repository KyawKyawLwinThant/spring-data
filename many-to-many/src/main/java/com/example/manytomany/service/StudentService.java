package com.example.manytomany.service;

import com.example.manytomany.dao.StudentDao;
import com.example.manytomany.dao.SubjectDao;
import com.example.manytomany.entity.Student;
import com.example.manytomany.entity.Subject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    private final StudentDao studentDao;
    private final SubjectDao subjectDao;

    public StudentService(StudentDao studentDao, SubjectDao subjectDao) {
        this.studentDao = studentDao;
        this.subjectDao = subjectDao;
    }

    @Transactional
    public void createDb(){
        Student s1=new Student("John","Doe","john@gmail.com");
        Student s2=new Student("John","William","william@gmail.com");
        Student s3=new Student("Thomas","Hardy","hardy@gmail.com");

        Subject subject1=new Subject("Java",3,2000);
        Subject subject2=new Subject("Python",3,3000);
        Subject subject3=new Subject("Groovy",3,2500);

        //mapping
       subject1.addStudent(s1);
       subject1.addStudent(s2);
       subject1.addStudent(s3);

       subject2.addStudent(s1);
       subject3.addStudent(s2);

        subjectDao.save(subject1);
        subjectDao.save(subject2);
        subjectDao.save(subject3);


    }










}

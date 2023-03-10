package com.example.zoodemo.service;

import com.example.zoodemo.dao.CageDao;
import com.example.zoodemo.dao.CategoryDao;
import com.example.zoodemo.dao.SupplierDao;
import com.example.zoodemo.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ZooService {
    private CageDao cageDao;
    private SupplierDao supplierDao;
    private CategoryDao categoryDao;

    public ZooService(CageDao cageDao, SupplierDao supplierDao, CategoryDao categoryDao) {
        this.cageDao = cageDao;
        this.supplierDao = supplierDao;
        this.categoryDao = categoryDao;
    }

    @Transactional
    public void createDb(){
        Cage cage1=new Cage("e001","E");
        Cage cage2=new Cage("n002","N");
        Cage cage3=new Cage("w001","W");

        Animal animal1=new Animal("Mammals",5);
        Animal animal2=new Animal("Reptile",10);
        Animal animal3=new Animal("Ambibious",5);

        Category category1=new Category();
        category1.setCategoryType("Monkey");
        Category category2=new Category();
        category2.setCategoryType("Snake");

        Supplier supplier=new Supplier("John","55-555-555","Yangon");

        FoodItem foodItem1=new FoodItem("Banana",1000);
        FoodItem foodItem2=new FoodItem("Meats",2000);
        FoodItem foodItem3=new FoodItem("Veg",3000);

        //mapping
        supplier.addFoodItem(foodItem1);
        supplier.addFoodItem(foodItem2);
        supplier.addFoodItem(foodItem3);

        animal1.addFootItem(foodItem1);
        animal1.addFootItem(foodItem2);
        animal2.addFootItem(foodItem1);
        animal3.addFootItem(foodItem3);

        cage1.setAnimal(animal1);
        animal1.setCage(cage1);
        cage2.setAnimal(animal2);
        animal2.setCage(cage2);
        cage3.setAnimal(animal3);
        animal3.setCage(cage3);

        category1.addAnimal(animal1);
        category1.addAnimal(animal2);
        category2.addAnimal(animal3);

        supplierDao.save(supplier);
        cageDao.save(cage1);
        cageDao.save(cage2);
        cageDao.save(cage3);

        categoryDao.save(category1);
        categoryDao.save(category2);


    }
}

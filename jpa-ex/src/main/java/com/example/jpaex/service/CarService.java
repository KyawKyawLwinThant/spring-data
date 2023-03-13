package com.example.jpaex.service;

import com.example.jpaex.dao.CarDao;
import com.example.jpaex.dao.CareManufacturerDao;
import com.example.jpaex.dao.InsurenceCompanyDao;
import com.example.jpaex.entity.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class CarService {
    private CarDao carDao;
    private CareManufacturerDao careManufacturerDao;
    private InsurenceCompanyDao insurenceCompanyDao;

    public CarService(CarDao carDao, CareManufacturerDao careManufacturerDao, InsurenceCompanyDao insurenceCompanyDao) {
        this.carDao = carDao;
        this.careManufacturerDao = careManufacturerDao;
        this.insurenceCompanyDao = insurenceCompanyDao;
    }
    @Transactional
    public void createDb(){
        Car car1=new Car("005","Japan", LocalDate.of(2020,3,27),10);
        Car car2=new Car("006","German", LocalDate.of(2020,3,27),10);
        Car car3=new Car("007","USA", LocalDate.of(2020,3,27),10);


        Person person1=new Person("John Doe",LocalDate.of(2000,3,27));
        Person person2=new Person("John William",LocalDate.of(2000,3,27));
        Person person3=new Person("John Williamson",LocalDate.of(2000,3,27));
        Person person4=new Person("Thomas Hardy",LocalDate.of(2000,3,27));
        Person person5=new Person("Richard Chan",LocalDate.of(2000,3,27));


        InsuranceCompany insuranceCompany1=new InsuranceCompany(
                "Indigo",new Address("79 Park Avenue","79","Yagon"),5
        );
        InsuranceCompany insuranceCompany2=new InsuranceCompany(
                "Iowa",new Address("Dream Land","11","Yagon"),7
        );

        CareManufacturer careManufacturer1=
                new CareManufacturer("Sun",new Address("Creek Bridge Road","22","Mdy"),100,
                        LocalDate.of(2005,5,10));
        CareManufacturer careManufacturer2=
                new CareManufacturer("Oracle",
                        new Address("Love Lane","11","Ygn"),200,LocalDate
                        .of(2007,5,10));
        CareManufacturer careManufacturer3=
                new CareManufacturer("Toyota",
                        new Address("Blue Sky","11","Ygn"),200,LocalDate
                        .of(2007,5,10));
        //mapping
        car1.setCareManufacturer(careManufacturer1);
        careManufacturer1.setCar(car1);

        car2.setCareManufacturer(careManufacturer2);
        careManufacturer2.setCar(car2);

        car3.setCareManufacturer(careManufacturer3);
        careManufacturer3.setCar(car3);

        car1.setInsuranceCompany(insuranceCompany1);
        insuranceCompany1.setCar(car1);

        car2.setInsuranceCompany(insuranceCompany2);
        insuranceCompany2.setCar(car2);

       // Person driver1=new Person("Thuza Nwe",LocalDate.of(2000,3,11));
       // Person dirver2=new Person("Thu Thu Thaw",LocalDate.of(2002,3,11));
        car1.addOwner(person1);
        car1.addOwner(person2);
        car2.addOwner(person3);
        car3.addOwner(person4);
        car3.addOwner(person5);

        car1.addDrivers(person1);
        car1.addDrivers(person2);

        carDao.save(car1);
        carDao.save(car2);
        carDao.save(car3);

        careManufacturerDao.save(careManufacturer1);
        careManufacturerDao.save(careManufacturer2);
        careManufacturerDao.save(careManufacturer3);

        insurenceCompanyDao.save(insuranceCompany1);
        insurenceCompanyDao.save(insuranceCompany2);

    }





}

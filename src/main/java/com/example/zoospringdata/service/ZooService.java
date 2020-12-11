package com.example.zoospringdata.service;

import com.example.zoospringdata.dao.CageRepo;
import com.example.zoospringdata.dao.FoodITemRepo;
import com.example.zoospringdata.entities.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ZooService {
    private final CageRepo cageRepo;
    private final FoodITemRepo foodITemRepo;

    public ZooService(CageRepo cageRepo, FoodITemRepo foodITemRepo) {
        this.cageRepo = cageRepo;
        this.foodITemRepo = foodITemRepo;
    }

    @Transactional
    public void createDb(){
        Category category = new Category("Mammals");
        Category category2 = new Category("Birds");

        Animal animal1 = new Animal("Elephant",2);
        Animal animal2 = new Animal("Monkey",5);

        Animal animal3 = new Animal("Owls",3);
        Animal animal4 = new Animal("HummingBirds",6);

        Cage cage1 = new Cage("1","East");
        Cage cage2 = new Cage("2","West");
        Cage cage3 = new Cage("3","South");
        Cage cage4 = new Cage("4","North ");

        Supplier supplier1 = new Supplier("Thomas","09999999","Yangon");
        Supplier supplier2 = new Supplier("James","05-666-7777","Mandalay");

        FoodItem foodItem = new FoodItem("Meat",200);
        FoodItem foodItem2 = new FoodItem("Oak",400);
        FoodItem foodItem3 = new FoodItem("Milk",1000);
        FoodItem foodItem4 = new FoodItem("Eggs",3000);

        //mapping
        animal1.setCategory(category);
        animal2.setCategory(category);
        animal3.setCategory(category2);
        animal4.setCategory(category2);

        cage1.setAnimal(animal1);
        cage2.setAnimal(animal2);
        cage3.setAnimal(animal3);
        cage4.setAnimal(animal4);

        foodItem.setSupplier(supplier1);
        foodItem2.setSupplier(supplier1);
        foodItem3.setSupplier(supplier2);
        foodItem4.setSupplier(supplier2);

        foodItem.getAnimals().add(animal1);
        foodItem.getAnimals().add(animal2);
        foodItem.getAnimals().add(animal3);
        foodItem.getAnimals().add(animal4);

        foodItem2.getAnimals().add(animal2);
        foodItem3.getAnimals().add(animal3);
        foodItem4.getAnimals().add(animal4);

        cageRepo.save(cage1);
        cageRepo.save(cage2);
        cageRepo.save(cage3);
        cageRepo.save(cage4);

        foodITemRepo.save(foodItem);
        foodITemRepo.save(foodItem2);
        foodITemRepo.save(foodItem3);
        foodITemRepo.save(foodItem4);
    }
}

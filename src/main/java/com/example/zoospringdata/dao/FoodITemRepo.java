package com.example.zoospringdata.dao;

import com.example.zoospringdata.entities.FoodItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodITemRepo extends CrudRepository<FoodItem,Integer> {
}

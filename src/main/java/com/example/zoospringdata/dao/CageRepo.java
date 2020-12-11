package com.example.zoospringdata.dao;

import com.example.zoospringdata.entities.Cage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CageRepo extends CrudRepository<Cage,Integer> {
}

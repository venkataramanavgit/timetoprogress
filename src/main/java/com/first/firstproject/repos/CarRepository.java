package com.first.firstproject.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.first.firstproject.entities.Car;

@Repository
public interface CarRepository extends CrudRepository<Car,Long> {

	
}

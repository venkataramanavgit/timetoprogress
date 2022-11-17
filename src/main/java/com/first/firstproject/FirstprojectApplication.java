package com.first.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.first.firstproject.entities.Car;
import com.first.firstproject.repos.CarRepository;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner {
	
	// private static final Logger Logger = LoggerFactory.getLogger(FirstprojectApplication.class); 
	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		repository.save(new Car("Nissan", "Leaf","White",  "SSJ-3002", 2019, 29000));
		repository.save(new Car("Toyota", "Prius", "Silver","KKO-0212", 2020, 39000));
//		for (Car car : repository.findAll()) {
//			 Logger.info(car.getBrand() + " "+ car.getModel());
//			 }
	}

}

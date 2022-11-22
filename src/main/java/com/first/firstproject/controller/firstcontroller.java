package com.first.firstproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.firstproject.entities.Car;
import com.first.firstproject.repos.CarRepository;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/car")
public class firstcontroller {

    @Autowired
    private CarRepository Carrep;
    
   
    @GetMapping
    public List<Car>   findAllCars() {
        // Implement
    	return  (List<Car>) Carrep.findAll();
   
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Car> findCarrById(@PathVariable(value = "id") long id) {
       // Implement
    
    	 Optional<Car> user =  Carrep.findById(id);
    	 
    	    if(user.isPresent()) {
    	        return ResponseEntity.ok().body(user.get());
    	    } else {
    	        return ResponseEntity.notFound().build();
    	    }
    	
    }
 
    @PostMapping
    public Car saveUser(@Validated @RequestBody Car car) {
        return Carrep.save(car);
    	
    }
	
}

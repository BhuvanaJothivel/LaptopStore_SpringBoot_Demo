package com.product.laptop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.laptop.model.Laptop;
import com.product.laptop.repostitory.LaptopRepo;

@RestController
public class LaptopController {

	@Autowired
	private LaptopRepo laprepo;
	
	@PostMapping("addlap")
	public Laptop addLaptop(@RequestBody Laptop lap) {
		return laprepo.save(lap);
	}
	
	@PutMapping("editlap")
	public Laptop updateLaptop(@RequestBody Laptop lap) {
		return laprepo.save(lap);
	}
	
	@DeleteMapping("deletelap")
	public String deleteAllLaptop() {
		String result = "";
		try {	
			laprepo.deleteAll();
			result = "all records deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		
		return result;
	}
	
	@DeleteMapping("deletelap/{id}")
	public String deleteLaptopById(@PathVariable int id) {
		String result = "";
		try {	
			laprepo.deleteById(id);
			result = "laptop record deleted";
		}
		catch(Exception e) {
			result = "error occurred";
		}
		
		return result;
	}
	
	@GetMapping("getalllaptop")
	public List<Laptop> getAllLaptop() {
		return laprepo.findAll();
	}
	
	@GetMapping("getlaptopbyid/{id}")
	public Optional<Laptop> getLaptopById(@PathVariable int id) {
		return laprepo.findById(id);
	}
	
	@GetMapping("getlaptopbyprice/{price}")
	public List<Laptop> getLaptopByPrice(@PathVariable int price) {
		return laprepo.findByPrice(price);
	}
}

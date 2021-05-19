package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;

	@GetMapping("/getlist")
	public List<Customer> get() {
		return repository.findAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Customer customer) {
		repository.save(customer);	
	}
	
}
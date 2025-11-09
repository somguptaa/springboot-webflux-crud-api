package com.som.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.som.entity.*;
import com.som.repository.CustomerRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/createcustomer")
	public Mono<Customer> createCustomer(@RequestBody Customer customer) {
		Mono<Customer> save = customerRepo.save(customer);
		return save;
	}
	
	@PostMapping("/customersave")
	public Mono<Customer> saveCustomer(@RequestBody Customer customer) {
		Mono<Customer> save = customerRepo.save(customer);
		return save;
	}

	@GetMapping("/getAllCustomer")
	public Flux<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}
	
	@GetMapping("/getbyId/{id}")
	public Mono<Customer> getById(@PathVariable String id) {
	    return customerRepo.findById(id);
	}

	 @PutMapping("/upadtebyId/{id}")
	 public Mono<Customer> update(@PathVariable String id, @RequestBody Customer
	 updated) {
	    return customerRepo.findById(id)
	            .flatMap(existing -> {
//	                existing.setFirstName(updated.getFirstName());
//	                existing.setLastName(updated.getLastName());
//	                existing.setEmail(updated.getEmail());		
//	                existing.setPassword(updated.getPassword());
//	                existing.setContactId(updated.getContactId());	
	            	BeanUtils.copyProperties(updated, existing);   	//BeanUtils is use for copy property values from one Java bean to another
	            													//we have two parameter (source , target) 
	            													//source = where data comes from
	        														// target = where data is copied to
	            													//no need to write seprate modifition code	
	                return customerRepo.save(existing);
	            });
	 }
	 
	 
	 @DeleteMapping("/deleteAllCustomer")
		public Mono<Void> deleteAllCustomer() {
			return customerRepo.deleteAll();
		}
	 
	 @DeleteMapping("deletebyId/{id}")
	    public Mono<Void> deleteCustomer(@PathVariable String id) {
	        return customerRepo.deleteById(id);
	    }

}

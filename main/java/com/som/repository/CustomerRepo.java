package com.som.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.som.entity.Customer;

public interface CustomerRepo extends ReactiveMongoRepository<Customer, String>{

}

package com.apiexample.project1.repository;

import com.apiexample.project1.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository <Customer, String>{

}

package com.example.lab3restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab3restapi.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

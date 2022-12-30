package com.example.lab3restapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.lab3restapi.model.Customer;
import com.example.lab3restapi.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

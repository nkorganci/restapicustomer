package com.example.lab3restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab3restapi.service.CustomerService;

@RestController
public class CustomerController {

	CustomerService customerService;
	
	@PostMapping
	public void createCustomer() {
		
		
	}
	
}

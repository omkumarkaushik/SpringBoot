package com.buisness.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buisness.shop.entity.Customer;
import com.buisness.shop.service.buisnessService;

@RestController
public class CustomerController {
	
	@Autowired
	private buisnessService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveProduct(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomer(){
		return service.getCustomer();
	}

}

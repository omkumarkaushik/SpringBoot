package com.buisness.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buisness.shop.entity.Customer;
import com.buisness.shop.repository.CustomerRepository;

@Service
public class buisnessService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveProduct(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> getCustomer(){
		return repository.findAll();
	}

}

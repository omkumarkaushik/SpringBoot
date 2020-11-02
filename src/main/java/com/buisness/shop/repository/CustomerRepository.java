package com.buisness.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buisness.shop.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //Customer findByName(String customerName);
}

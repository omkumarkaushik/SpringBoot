package com.buisness.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "customer" )
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer customerId;
	private String customerName;
	private String address;
	private double balance;
	

}

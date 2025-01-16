package com.controller;

import java.util.List;

import com.entity.Customer;
import com.service.RegisterService;


public class RegisterController {

	public String register(Customer customer) {
		RegisterService registerService = new RegisterService();
		return	registerService.register(customer);
		
	}

	public List<Customer> getAllCustomer() {
		RegisterService registerService = new RegisterService();
	return	registerService.getAllCustomer();
		
	}

	public List<Customer> getCustomerByLocation(String location) {
		RegisterService registerService = new RegisterService();
	return	registerService.getCustomerByLocation(location);
		
	}

	public List<Long> maxMobileNumber() {
		
		RegisterService registerService = new RegisterService();
		return registerService.maxMobileNumber();
	}

	public List<Long> minMobileNumber() {
		RegisterService registerService = new RegisterService();
		return registerService.minMobileNumber();
	}

	public List<Long> avgMobileNumber() {
		RegisterService registerService = new RegisterService();
		return registerService.avgMobileNumber();
	}

	
}

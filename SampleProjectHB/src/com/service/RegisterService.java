package com.service;

import java.util.List;

import com.dao.RegisterDao;
import com.entity.Customer;

public class RegisterService {

	public String register(Customer customer) {
		RegisterDao registerdao = new RegisterDao();
	boolean isRegister= 	registerdao.register(customer);
	
	if (isRegister) {
		return "user registration success.....!!!!";
	} else {
		return "registration failed...";
	}
	}

	public List<Customer> getAllCustomer() {
		RegisterDao registerdao = new RegisterDao();
	return	registerdao.getAllCustomer();
		
	}

	public List<Customer> getCustomerByLocation(String location) {
		RegisterDao registerdao = new RegisterDao();
		
		return	registerdao.getCustomerByLocation(location);
		
	}

	public List<Long> maxMobileNumber() {
		RegisterDao registerdao = new RegisterDao();
		return	registerdao.maxMobileNumber();
	}

	public List<Long> minMobileNumber() {
		RegisterDao registerdao = new RegisterDao();
		return	registerdao.minMobileNumber();
	}

	public List<Long> avgMobileNumber() {
		RegisterDao registerdao = new RegisterDao();
		return	registerdao.avgMobileNumber();
	}

	

}

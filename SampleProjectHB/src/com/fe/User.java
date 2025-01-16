package com.fe;

import java.util.List;

import com.controller.RegisterController;
import com.entity.Customer;

public class User {

	public static void main(String[] args) {
		//registration karaych ahe tr method call kara
//		Customer customer= new Customer();
//		customer.setCustName("sushant");
//		customer.setLocation("mumbai");
//		customer.setMobile(337595);
		
		RegisterController controller = new RegisterController();
		//String msg=	controller.register(customer);
//		List<Customer> list=	controller.getAllCustomer();//get kartoy no need to provide arg.
//		
//		//list ahe so iterate
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
		
		
		//location wise data pahije
//		List<Customer> list=	controller.getCustomerByLocation("pune");
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
		
//		List<Long> list=	controller.maxMobileNumber();
//		for (Long  customer : list) {
//			System.out.println(customer);
//		}
		
//		List<Long> list=	controller.minMobileNumber();
//		for (Long  customer : list) {
//			System.out.println(customer);
//		}
		
		List<Long> list=	controller.avgMobileNumber();
		for (Long  customer : list) {
			System.out.println(customer);
		}
	}

}

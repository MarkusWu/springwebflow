package com.maocaiwu.springwebflow.pizza.service;

import org.springframework.stereotype.Service;

import com.maocaiwu.springwebflow.pizza.domain.Customer;
import com.maocaiwu.springwebflow.pizza.domain.Order;

@Service
public class PizzaFlowService {
	
	public void saveOrder(Order order){
		System.out.println("Order is saved : " + order);
	}
	
	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException{
		if(phoneNumber.equals("13479717359")){
			Customer customer = new Customer();
			customer.setFirstName("Maocai");
			customer.setLastName("Wu");
			customer.setPhoneNumber(phoneNumber);
			return customer;
		}
		throw new CustomerNotFoundException("User not exist");
	}
}

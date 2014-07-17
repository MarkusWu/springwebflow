package com.maocaiwu.springwebflow.pizza.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.maocaiwu.springwebflow.pizza.domain.Customer;
import com.maocaiwu.springwebflow.pizza.domain.Order;
import com.maocaiwu.springwebflow.pizza.domain.PaymentDetails;

@Service
public class PizzaFlowService {
	
	@Value("#{toppingMenu}")
	Properties toppingPrice;
	
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
	
	public boolean checkDeliveryArea(String zipCode){
		return ("11236".equals(zipCode));
	}
	
	public void addCustomer(Customer customer){
		System.out.println("customer " + customer.getFirstName() + "  is added.");
	}
	
	public void verifyPayment(PaymentDetails payment){
		
	}
	
}

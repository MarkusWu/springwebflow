package com.maocaiwu.springwebflow.pizza.service;

import java.util.Map;
import java.util.Set;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.maocaiwu.springwebflow.pizza.domain.CustomPizza;
import com.maocaiwu.springwebflow.pizza.domain.Customer;
import com.maocaiwu.springwebflow.pizza.domain.Order;
import com.maocaiwu.springwebflow.pizza.domain.PaymentDetails;
import com.maocaiwu.springwebflow.pizza.domain.Pizza;

@Service
public class PizzaFlowService {
	
	@Value("#{toppingsMenu}")
	Map<String, Double> toppingsMenu;
	
	@Value("#{pizzasMenu}")
	Map<String, Pizza> pizzasMenu;
	
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
	
	public Set<String> toppingsList(){
		return toppingsMenu.keySet();
	}
	
	public Set<String> pizzasList(){
		return pizzasMenu.keySet();
	}
	
	public Pizza makePizza(CustomPizza customPizza){
		Pizza pizza = pizzasMenu.get(customPizza.getPizzaName());
		pizza.setSize(customPizza.getPizzaName());
		pizza.setToppings(customPizza.getToppings());
		return pizza;
	}
	
	public Double calculateCost(Order order){
		if(order == null){
			System.out.println("Order is empty");
		}
		double totalCost = 0;
		for(Pizza pizza : order.getPizzas()){
			totalCost += pizza.getCost();
			for(String topping : pizza.getToppings()){
				Double toppingPrice = toppingsMenu.get(topping);
				if(toppingPrice == null){
					toppingPrice = 0.0;
				}
				totalCost += toppingPrice;
			}
		}
		
		return totalCost;
	}
	
}

package com.maocaiwu.springwebflow.pizza.domain;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Customer customer;
	PaymentDetails paymentDetails;
	List<Pizza> pizzas;
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}


	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	public void addPizza(Pizza pizza){
		pizzas.add(pizza);
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}


	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
}

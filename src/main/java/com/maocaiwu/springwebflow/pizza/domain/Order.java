package com.maocaiwu.springwebflow.pizza.domain;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Customer customer;
	PaymentType paymentType;
	Double totalAmount;
	List<Pizza> pizzas;
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	public PaymentType getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmoutnt(Double totalAmount) {
		this.totalAmount = totalAmount;
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


	public enum PaymentType{
		CASH, CREDIT_CARD, DEBIT_CARD, OTHERS
	}
	
	@Override
	public String toString(){
		return "Total amount is : " + totalAmount + "; by " + paymentType;
	}
}

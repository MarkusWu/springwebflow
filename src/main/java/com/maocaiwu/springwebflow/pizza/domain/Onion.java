package com.maocaiwu.springwebflow.pizza.domain;

public class Onion extends ToppingDecorator{
	
	String description ="Very fresh red Onion";
	String shortName = "red onion";
	Double cost = 0.5;
	
	public Onion(){
		
	}
	
	public Onion(Pizza pizza){
		this.pizza = pizza;
	}
	
}

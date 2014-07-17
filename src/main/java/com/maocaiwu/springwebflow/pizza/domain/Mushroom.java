package com.maocaiwu.springwebflow.pizza.domain;

public class Mushroom extends ToppingDecorator {
	
	String description = "a Chinese black mushroom";
	String shortName = "mushroom";
	Double cost = 0.5;
	
	public Mushroom(){
		
	}
	
	public Mushroom(Pizza pizza){
		this.pizza = pizza;
	}
}

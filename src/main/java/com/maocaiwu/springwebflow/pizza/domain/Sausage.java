package com.maocaiwu.springwebflow.pizza.domain;

public class Sausage extends ToppingDecorator{
	String description = "huge German sausage";
	String shortName = "German sauage";
	Double cost = 1.0;
	public Sausage(Pizza pizza){
		this.pizza = pizza;
	}
}

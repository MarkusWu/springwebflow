package com.maocaiwu.springwebflow.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum PizzaSize {
	
	SMALL(0.5), MEDIUM(1), LARGE(1.8);
	
	private double weight;
	
	PizzaSize(double weight){
		this.weight = weight;
	}
	
	public double weight(){
		return weight;
	}
	
	public static List<PizzaSize> asList(){
		PizzaSize[] values = PizzaSize.values();
		return Arrays.asList(values);
	}
	
}

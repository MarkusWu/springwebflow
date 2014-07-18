package com.maocaiwu.springwebflow.pizza.domain;

import java.util.List;

public abstract class Pizza {
	String description = "Unkown pizza";
	String shortName = "Unkown pizza";
	Double cost;
	List<String> toppings;
	PizzaSize size;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getCost() {
		double weight = 1;
		if(size != null){
			weight = size.weight();
		}
		return cost * weight;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getShortName(){
		return shortName;
	}
	public List<String> getToppings(){
		return toppings;
	}
	public void setToppings(List<String> toppings){
		this.toppings = toppings;
	}
	public PizzaSize getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = PizzaSize.valueOf(size);
	}
	@Override
	public String toString(){
		return shortName + "(" + size.toString() + ") : $" + cost;
	}
}
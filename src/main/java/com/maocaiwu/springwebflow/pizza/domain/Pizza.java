package com.maocaiwu.springwebflow.pizza.domain;

public abstract class Pizza {
	String description = "Unkown pizza";
	String shortName = "Unkown pizza";
	Double cost;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getShortName(){
		return shortName;
	}
}
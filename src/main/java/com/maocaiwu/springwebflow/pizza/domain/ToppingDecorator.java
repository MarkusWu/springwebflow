package com.maocaiwu.springwebflow.pizza.domain;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	
	@Override
	public String getDescription(){
		return pizza.getDescription() + "\n " + getDescription(); 
	}
	
	@Override
	public Double getCost(){
		return pizza.getCost() + this.cost;
	}
	
	@Override
	public String getShortName(){
		return  pizza.getShortName() + ", " + getShortName();
	}
}

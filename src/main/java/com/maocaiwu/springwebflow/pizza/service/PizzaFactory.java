package com.maocaiwu.springwebflow.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.maocaiwu.springwebflow.pizza.domain.Pizza;

@Component
public class PizzaFactory {
	
	@Autowired
	private ApplicationContext appContext;
	
	public Pizza createPizza(String pizzaName){
		Pizza pizza = null;
		
		try{
		 pizza = (Pizza) appContext.getBean(pizzaName);
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return pizza;
	}
}

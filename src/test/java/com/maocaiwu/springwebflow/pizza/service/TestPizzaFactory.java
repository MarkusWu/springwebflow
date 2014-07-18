package com.maocaiwu.springwebflow.pizza.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maocaiwu.springwebflow.pizza.domain.ChesePizza;
import com.maocaiwu.springwebflow.pizza.domain.Pizza;

public class TestPizzaFactory {
	
	private PizzaFactory pizzaFactory;
	
	@Before
	public void setUp(){
		ApplicationContext context = new ClassPathXmlApplicationContext("pizza-context.xml");
		pizzaFactory = (PizzaFactory) context.getBean("pizzaFactory");
	}
	
	@Test
	public void testCreatePizza() {
		Pizza pizza = (Pizza) pizzaFactory.createPizza("chesePizza");
		
		assertTrue((pizza instanceof ChesePizza));
	}

}

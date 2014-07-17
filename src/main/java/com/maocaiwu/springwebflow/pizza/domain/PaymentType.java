package com.maocaiwu.springwebflow.pizza.domain;

import java.util.List;
import java.util.Arrays;

public enum PaymentType {
	CREDIT_CARD, DEBIT_CARD, CASH, CHECK, OTHERS;
	
	public static List<PaymentType> asList(){
		PaymentType[] values = PaymentType.values();
		return Arrays.asList(values);
	}
	
	@Override
	public String toString(){
		return name().replace("_", " ");
	}
}

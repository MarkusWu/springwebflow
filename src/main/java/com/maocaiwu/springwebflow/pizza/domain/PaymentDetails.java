package com.maocaiwu.springwebflow.pizza.domain;

public class PaymentDetails {
	PaymentType paymentType;
	Double totalCost;
	
	public PaymentType getPaymentType(){
		return paymentType;
	}
	
	public void setPaymentType(String paymentTypeString){
		this.paymentType = PaymentType.valueOf(paymentTypeString.replace(' ', '_'));
	}
	
	public Double getTotalCost(){
		return totalCost;
	}
	
	public void setTotalCost(Double totalCost){
		this.totalCost = totalCost;
	}
}

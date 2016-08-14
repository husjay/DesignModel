package com.husjay.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("老客户小批量打8折");
		return price*0.85;
	}

}

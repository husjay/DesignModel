package com.husjay.strategy;

public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("普通用户小批量不打折");
		return price;
	}

}

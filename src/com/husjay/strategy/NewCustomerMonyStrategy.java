package com.husjay.strategy;

public class NewCustomerMonyStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("普通用户批量购买打9折");
		return price*0.9;
	}

}

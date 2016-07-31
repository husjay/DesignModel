package com.husjay.factory;

public class BaomaFactory implements CarFactory02{

	@Override
	public Car createCar() {
		return new Baoma();
	}

}

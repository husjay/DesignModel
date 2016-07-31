package com.husjay.factory;

public class AudiFactory implements CarFactory02{

	@Override
	public Car createCar() {
		return new Audi();
	}

}

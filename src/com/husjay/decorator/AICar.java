package com.husjay.decorator;

public class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);
	}
	
	public void move() {
		super.move();
		auto();
	}
	
	public void auto() {
		System.out.println("自动驾驶");
	}

}

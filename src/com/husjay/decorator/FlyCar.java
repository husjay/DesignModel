package com.husjay.decorator;

public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void move() {
		super.move();
		fly();
	}
	
	public void fly() {
		System.out.println("天上飞");
	}

}

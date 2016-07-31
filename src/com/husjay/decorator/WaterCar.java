package com.husjay.decorator;

public class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}
	
	public void move() {
		super.move();
		swim();
	}
	
	public void swim() {
		System.out.println("水中游");
	}

}

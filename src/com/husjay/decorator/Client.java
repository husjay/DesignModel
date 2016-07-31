package com.husjay.decorator;

public class Client {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("增加天上飞功能:");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("增加水中游功能：");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("组合天上飞和水中游：");
		SuperCar superCar = new WaterCar(new FlyCar(car));
		superCar.move();
	}

}

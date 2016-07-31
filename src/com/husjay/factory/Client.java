package com.husjay.factory;

public class Client {
	public static void main(String[] arhs) {
		//不使用工厂模式
		Car car1 = new Audi();
		Car car2 = new Baoma();
		
		//使用简单工厂模式，添加新产品(car)需要修改CarFactory类
		CarFactory01 carFactory = new CarFactory01();
		car1 = carFactory.createCar("audi");
		car2 = carFactory.createCar("baoma");
		
		//使用方法工厂模式，添加新产品
		CarFactory02 audiFactory = new AudiFactory();
		CarFactory02 baomaFactory = new AudiFactory();
		car1 = audiFactory.createCar();
		car2 = baomaFactory.createCar();
		
		//使用抽象工厂模式
	}
}

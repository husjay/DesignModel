package com.husjay.factory;

public class CarFactory01 {
	public Car createCar(String type) {
		switch(type) {
		case "audi":return new Audi();
		case "baoma":return new Baoma();
		default:return null;
		}
	}
}

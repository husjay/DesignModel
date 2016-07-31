package com.husjay.abstractFactory;

public class Client {
	public static void main(String[] args) {
		CarFactory luxuryCarFactory = new LuxuryCarFactory();
		Engine luxuryEngine = luxuryCarFactory.createEngine();
		luxuryEngine.start();
		luxuryEngine.stop();
	}
}

package com.husjay.strategy;

public class Context {
	//spring注解注入
	private Strategy strategy;

	//构造器注入
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double getPrice(double price) {
		return strategy.getPrice(price);
	}

	public Strategy getStrategy() {
		return strategy;
	}
	//set方法注入
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}

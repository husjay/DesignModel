package com.husjay.decorator;

/**
 * 装饰器角色
 * @author hsj
 *
 */
public class SuperCar implements ICar {
	
	private ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		car.move();
	}

}

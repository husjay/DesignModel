package com.husjay.decorator;

/**
 * 具体构件对象
 * @author hsj
 *
 */
public class Car implements ICar{

	@Override
	public void move() {
		System.out.println("可以在陆地上跑的车");
		
	}
	

}

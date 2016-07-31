package com.husjay.bridge;

/**
 * 采用多继承的电脑分类
 * @author hsj
 *
 */

public class Computer {
	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}

	public void sale(){
		brand.sale();
	}
}

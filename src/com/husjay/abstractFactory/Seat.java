package com.husjay.abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
		
	}
	
}

class LowerSeat implements Seat {

	@Override
	public void massage() {
		System.out.println("不可以自动按摩");
		
	}
	
}

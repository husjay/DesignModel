package com.husjay.proxy.staticProxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("confer");
		
	}

	@Override
	public void signContract() {
		System.out.println("signConstact");
	}

	@Override
	public void bookTicket() {
		System.out.println("bookTicket");
	}

	@Override
	public void sing() {
		System.out.println("sing");
	}

	@Override
	public void collectMoney() {
		System.out.println("collectMoney");
	}

	
}

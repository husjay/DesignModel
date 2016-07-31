package com.husjay.proxy.staticProxy;

public class ProxyStar implements Star{
	
	private Star star;

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

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
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("collectMoney");
	}
	
}

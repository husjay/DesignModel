package com.husjay.mediator;


public class Development implements Department{
	
	private Mediator mediator;
	
	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研");
		
	}

	@Override
	public void outAction() {
		System.out.println("却少经费");
	}

}

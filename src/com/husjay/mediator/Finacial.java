package com.husjay.mediator;

public class Finacial implements Department{
	
	private Mediator mediator;
	
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		
	}

}

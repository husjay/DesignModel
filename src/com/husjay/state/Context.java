package com.husjay.state;

public class Context {
	
	private State state;
	
	public void setState(State state) {
		System.out.println("modify state");
		this.state = state;
		this.state.handle();
	}

}

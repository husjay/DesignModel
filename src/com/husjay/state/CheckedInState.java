package com.husjay.state;

public class CheckedInState implements State{

	@Override
	public void handle() {
		System.out.println("room checked in");
	}

}

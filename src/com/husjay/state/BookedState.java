package com.husjay.state;

public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("room booked");
	}

}

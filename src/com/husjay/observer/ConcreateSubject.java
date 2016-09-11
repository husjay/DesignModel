package com.husjay.observer;

public class ConcreateSubject extends Subject{
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		
		this.notifyAll();
	}
	
}

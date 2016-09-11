package com.husjay.observer.javaObserver;

import java.util.Observable;

public class ConcreateSubject extends Observable{
	
	private int state;
	
	public void set(int state) {
		this.state = state;
		
		//目标对象已经改变
		setChanged();
		
		//通知所有观察者
		notifyObservers();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
}

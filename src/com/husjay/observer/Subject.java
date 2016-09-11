package com.husjay.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	
	protected List<Observer> observers;
	
	public void init() {
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer observer) {
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyAllObserver() {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(this);
		}
	}

}

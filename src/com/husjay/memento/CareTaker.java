package com.husjay.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> mementos;
	
	public Memento getMemento() {
		Memento memento = null;
		if(mementos.size() > 0) {
			memento = mementos.get(mementos.size()-1);
			mementos.remove(mementos.size()-1);			
		}
		return memento;
	}
	
	public void setMemento(Memento memento) {
		if(mementos == null) {
			mementos = new ArrayList<Memento>();
		}
		mementos.add(memento);
	}
	
	

}

package com.husjay.memento;

public class Client {
	
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		Originator originator = new Originator("hsj", 26, 10000);
		careTaker.setMemento(originator.memento());
		
		originator.setName("hhh");
		careTaker.setMemento(originator.memento());
		originator.setAge(20);
		careTaker.setMemento(originator.memento());
		originator.setSalary(100000);
		
		originator.revovery(careTaker.getMemento());
		originator.revovery(careTaker.getMemento());
		originator.revovery(careTaker.getMemento());
		originator.revovery(careTaker.getMemento());
		originator.revovery(careTaker.getMemento());
		
	}

}

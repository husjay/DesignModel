package com.husjay.observer.javaObserver;

public class Client {
	
	public static void main(String[] args) {
		
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
	
		ConcreateSubject subject = new ConcreateSubject();
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(3000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
	}

}

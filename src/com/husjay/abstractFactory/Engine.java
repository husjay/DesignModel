package com.husjay.abstractFactory;

public interface Engine {
	void start();
	void stop();
}

class LuxuryEngine implements Engine {

	@Override
	public void start() {
		System.out.println("start fast");
		
	}

	@Override
	public void stop() {
		System.out.println("stop fast");
		
	}
	
}

class LowerEngine implements Engine {

	@Override
	public void start() {
		System.out.println("start slow");
		
	}

	@Override
	public void stop() {
		System.out.println("stop slow");
		
	}
	
}

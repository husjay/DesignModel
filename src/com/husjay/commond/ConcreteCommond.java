package com.husjay.commond;


public class ConcreteCommond implements Commond{
	
	private Receiver receiver;
	
	public ConcreteCommond(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void execute() {
		
		//执行前操作
		
		receiver.action();
		
		//执行后操作
	}

}

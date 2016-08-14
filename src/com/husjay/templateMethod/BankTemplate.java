package com.husjay.templateMethod;

public abstract class BankTemplate {
	
	public void takeNumber() {
		System.out.println("取号码");
	}
	
	public abstract void transact() ;
	
	public void evaluate() {
		System.out.println("评价");
	}
	
	public final void process() {
		
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
		
	}

}

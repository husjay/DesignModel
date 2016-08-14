package com.husjay.templateMethod;

public class Client {

	public static void main(String[] args) {
		BankTemplate bankTemplate = new WithDraw();
		bankTemplate.process();
		
		//采用匿名内部类
		BankTemplate bankTemplate2 = new BankTemplate() {
			
			@Override
			public void transact() {
				System.out.println("存款业务");
				
			}
		};
		bankTemplate2.process();
	}
}


class WithDraw extends BankTemplate {

	@Override
	public void transact() {
		System.out.println("取款业务");
	}
	
}
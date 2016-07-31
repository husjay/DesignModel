package com.husjay.proxy.staticProxy;

public class Client {
	
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		
		//调用代理者方法
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTicket();
		
		//调用真实类的方法
		proxyStar.sing();
		
		//调用代理者方法
		proxyStar.collectMoney();
	}

}

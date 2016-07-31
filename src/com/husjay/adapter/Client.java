package com.husjay.adapter;

/**
 * 客户端类
 * @author hsj
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		//Adaptee adaptee = new Adaptee();
		
		Target target = new Adapter();
		
		client.test1(target);
	}

	public void test1(Target t) {
		t.handleReq();
	}
	
	
}

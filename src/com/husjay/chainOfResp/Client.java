package com.husjay.chainOfResp;

public class Client {
	
	public static void main(String[] args) {
		Leader a = new Director("张三");
		Leader b = new Manager("李四");
		Leader c = new GeneralManager("王五");
		
		//组织责任链
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		//请假处理
		LeaveRequest request1 = new LeaveRequest("Tom", 2, "回英国老家探亲");
		LeaveRequest request2 = new LeaveRequest("Jack", 8, "回英国老家探亲");
		LeaveRequest request3 = new LeaveRequest("Lisa", 12, "回英国老家探亲");
		LeaveRequest request4 = new LeaveRequest("Lisa", 35, "回英国老家探亲");
		a.hanfleRequest(request1);
		a.hanfleRequest(request2);
		a.hanfleRequest(request3);
		a.hanfleRequest(request4);
	}

}

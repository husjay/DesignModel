package com.husjay.FactoryModel;

public class OperationApp {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperation("+");
		oper.setNumberA(1);
		oper.setNumberB(2);
		double result = oper.operateResult();
		System.out.println("result="+result);
	}
}

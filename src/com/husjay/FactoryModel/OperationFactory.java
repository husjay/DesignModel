package com.husjay.FactoryModel;

public class OperationFactory extends Operation{

	public static Operation createOperation(String operation) {
		Operation oper = null;
		switch(operation) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		}
		return oper;
	}
}

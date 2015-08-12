package com.husjay.FactoryModel;

public class OperationMul extends Operation{
	@Override
	public double operateResult() {
		double result = 0;
		result = getNumberA() * getNumberB();
		return result;
	}
}

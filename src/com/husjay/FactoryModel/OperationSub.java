package com.husjay.FactoryModel;

public class OperationSub extends Operation{
	@Override
	public double operateResult() {
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
}

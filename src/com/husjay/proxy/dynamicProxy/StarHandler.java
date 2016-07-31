package com.husjay.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	
	Star realStar;

	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		
		if(method.getName().equals("sing")) {
			method.invoke(realStar, args);
		} else {
			System.out.println("proxy");
		}
		
		return null;
	}

}

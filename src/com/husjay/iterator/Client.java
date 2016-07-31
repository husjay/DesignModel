package com.husjay.iterator;

public class Client {
	
	public static void main(String[] args) {
		
		ConcreateMyAggreate cma = new ConcreateMyAggreate();
		cma.addObject("111");
		cma.addObject("222");
		cma.addObject("333");
		cma.addObject("444");
		
		MyIterator iterator = cma.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}

}

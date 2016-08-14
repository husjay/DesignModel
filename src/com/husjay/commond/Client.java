package com.husjay.commond;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		Commond commond = new ConcreteCommond(new Receiver());
		List<Commond> commonds = new ArrayList<Commond>();
		commonds.add(commond);
		
		Invoke invoke = new Invoke(commonds);
		
		invoke.call();
	}

}

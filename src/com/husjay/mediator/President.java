package com.husjay.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator{
	
	private Map<String, Department> map = new HashMap<String, Department>();

	@Override
	public void register(String dname, Department d) {
		map.put(dname, d);
	}

	@Override
	public void command(String dname) {
		map.get(dname);
	}

}

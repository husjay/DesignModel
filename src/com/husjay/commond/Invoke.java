package com.husjay.commond;

import java.util.List;

public class Invoke {
	
	private List<Commond> commonds;

	public Invoke(List<Commond> commonds) {
		super();
		this.commonds = commonds;
	}

	public void call() {
		for(Commond commond : commonds) {
			commond.execute();
		}
	}

}

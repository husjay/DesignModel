package com.husjay.adapter;

/**
 * 适配器类
 * @author hsj
 *
 */
public class Adapter extends Adaptee implements Target{
	
	

	@Override
	public void handleReq() {
		super.request();
		
	}

}

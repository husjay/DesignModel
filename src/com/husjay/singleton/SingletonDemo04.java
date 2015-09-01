package com.husjay.singleton;
/**
 * 内部静态类实现单例
 * 优点：线程安全、调用效率高、延时加载
 * @author hsj
 *
 */
public class SingletonDemo04 {
	private SingletonDemo04() {
		
	}
	
	private static class SingletonClassinstance {
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}
	
	public static SingletonDemo04 getInstance() {
		return SingletonClassinstance.instance;
	}
}

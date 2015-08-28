package com.husjay.singleton;
/**
 * 饿汉式单例模式
 * @author hsj
 *
 */
public class SingletonDemo01 {
	//类初始化时，立即加载这个对象（不能延时加载）。
	//加载类时是线程安全的
	private static SingletonDemo01 instance = new SingletonDemo01();
	
	private SingletonDemo01() {
		
	}
	//方法没有同步（synchronized），调用效率高
	public static SingletonDemo01 getInstance() {
		return instance;
	}
}

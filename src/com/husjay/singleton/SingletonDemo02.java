package com.husjay.singleton;
/**
 * 懒汉式单例模式
 * @author hsj
 *
 */
public class SingletonDemo02 {
	//类初始化时，不初始化这个对象（延时加载，真正使用时加载）
	private static SingletonDemo02 instance = null;
	
	private SingletonDemo02() {
		
	}
	//方法同步（synchronized）,调用效率低
	public static synchronized SingletonDemo02 getInstance() {
		if(null == instance) {
			instance = new SingletonDemo02();
		}
		return instance;
	}
}

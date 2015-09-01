package com.husjay.singleton;
/**
 * 双重检测锁单例
 * 由于JVM编译优化的原因，可能会出问题，不建议使用
 * @author hsj
 *
 */
public class SingletonDemo03 {
	private static SingletonDemo03 instance = null;
	
	private SingletonDemo03() {
		
	}
	
	public static SingletonDemo03 getInstance() {
		if(null == instance) {
			SingletonDemo03 sc;
			synchronized (SingletonDemo03.class) {
				sc = instance;
				if(null == sc) {
					synchronized (SingletonDemo03.class) {
						if(null == sc) {
							sc = new SingletonDemo03();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}

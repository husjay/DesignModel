package com.husjay.singleton;
/**
 * 枚举类实现单例
 * 利用枚举类天然只有一个实例的特点
 * 优点：避免了反射和反序列化的漏洞
 * 缺点：没有延时加载
 * @author hsj
 *
 */
public enum SingletonDemo05 {
	
	//这个枚举元素本身就是单例
	INSTANCE;
	
	//添加新操作
	public void singletonOperation() {
		
	}
}

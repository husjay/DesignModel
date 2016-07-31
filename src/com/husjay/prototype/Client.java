package com.husjay.prototype;

import java.util.Date;
/**
 * 克隆实现
 * 1 浅克隆(克隆出来对象的对象属性指向同一个对象)
 * 2 深克隆(克隆出来对象的对象属性不同)
 * @author hsj
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(123344455L);
		Sleep s1 = new Sleep("saooli", date);
		System.out.println(s1);
		
		Sleep s2 = (Sleep) s1.clone();
		System.out.println(s2);
		
		s2.setName("duoli");
		date.setTime(234455566555L);	//s1和s2指向同一个对象date
		
		
		System.out.println(s1.getName()+"=="+s2.getName());
		System.out.println(s1.getBirthday()+"=="+s2.getBirthday());
	}
}

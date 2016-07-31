package com.husjay.prototype;

import java.util.Date;


public class Sleep implements Cloneable{
	private String name;
	private Date birthday;
	
	
	public Sleep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();	//直接调用Object的clone()方法
		
		//添加如下代码实现深克隆，即属性对象也克隆
		Sleep s = (Sleep) obj;
		s.birthday = (Date) this.birthday.clone();
		
		return obj;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}

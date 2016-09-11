package com.husjay.memento;

public class Memento {
	
	private String name;

	private int age;
	
	private double salary;

	public Memento() {
		super();
	}

	public Memento(Originator originator) {
		super();
		this.name = originator.getName();
		this.age = originator.getAge();
		this.salary = originator.getSalary();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

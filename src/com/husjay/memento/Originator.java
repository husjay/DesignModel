package com.husjay.memento;

public class Originator {
	
	private String name;

	private int age;
	
	private double salary;
	
	//备忘
	public Memento memento() {
		return new Memento(this);
	}
	
	//恢复
	public void revovery(Memento memento) {
		if(memento != null) {
			this.name = memento.getName();
			this.age = memento.getAge();
			this.salary = memento.getSalary();
			System.out.println(this.name+"--"+this.age+"--"+this.salary);
		} else {
			System.out.println("nothing to recovery");
		}
	}

	public Originator() {
		super();
	}

	public Originator(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println(this.name+"--"+this.age+"--"+this.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(this.name+"--"+this.age+"--"+this.salary);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println(this.name+"--"+this.age+"--"+this.salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println(this.name+"--"+this.age+"--"+this.salary);
	}
	
}

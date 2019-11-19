package com.cg.core;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String BU;
	private int age;
	
	public Employee(Integer id, String name, Double salary, String bU, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		BU = bU;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	
	private Employee() { }
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", BU=" + BU + ", age=" + age + "]";
	}

}

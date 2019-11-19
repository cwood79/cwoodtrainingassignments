package com.cg.core2;

public class Employee2 {

	private int id;
	private String name;
	private double salary;
	private int age;


	private SBU businessUnit;
	
	public Employee2() { }
	
	public Employee2(int id, String name, double salary, String bU, int age, SBU businessUnit) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.businessUnit = businessUnit;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void getSBUDetails() {
		System.out.println("SBU [sbuId=" + businessUnit.getSbuId() + ", sbuName=" + businessUnit.getSbuName() + ", sbuHead=" + businessUnit.getSbuHead()+ "]");
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", businessUnit="
				+ businessUnit + "]";
	}

	

}

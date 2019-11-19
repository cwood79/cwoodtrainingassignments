package com.capgemini.beans;

import java.util.Date;

public class Employee {
	
	private String name;
	private String position;
	private int salary;
	private int id;
	Date joinDate;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String position, int salary, int id)
	{
		this.name=name;
		this.position=position;
		this.salary=salary;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}


	

}

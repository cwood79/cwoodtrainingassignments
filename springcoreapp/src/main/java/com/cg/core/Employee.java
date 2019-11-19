package com.cg.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

	private Integer id;
	private String name;
	private Address addr;
	private List<String> skills = new ArrayList();
	private Map<Integer, String> months = new HashMap();

	public Employee(Integer id, String name, Address addr, List<String> skills, Map<Integer, String> months) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.skills = skills;
		this.months = months;
	}

	public Map<Integer, String> getMonths() {
		return months;
	}

	public void setMonths(Map<Integer, String> months) {
		this.months = months;
	}

	Employee() {}
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + ", skills=" + skills + ", months=" + months
				+ "]";
	}



}

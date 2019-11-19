package com.cg.core3;

import java.util.ArrayList;
import java.util.List;

public class SBU2 {



	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private ArrayList<Employee3> empList;
	
	public SBU2() { }
	
	public SBU2(int sbuCode, String sbuName, String sbuHead, ArrayList<Employee3> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}
	
	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee3> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<Employee3> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "SBU2 [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	public void printEmpList() {
		for(Employee3 e: empList)
		{
			System.out.println(e.toString());
		}
	}
}

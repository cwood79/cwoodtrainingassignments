package com.cg.core3;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.tools.javac.util.List;

public class EmployeeContainer {
	public static void main(String [] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SBUConfig.class);
		SBU2 sbu = (SBU2) context.getBean(SBU2.class);
		sbu.setSbuCode(3);
		sbu.setSbuName("SBU 2");
		sbu.setSbuHead("Bob");
		Employee3 e = new Employee3(1,"Emp1",60000.00);
		Employee3 e2 = new Employee3(2,"Emp2",65000.00);
		
		ArrayList<Employee3> empList = new ArrayList<Employee3>();
		empList.add(e);
		empList.add(e2);
		
		sbu.setEmpList(empList);
		
		System.out.println(sbu);
		sbu.printEmpList();
		

	}
}

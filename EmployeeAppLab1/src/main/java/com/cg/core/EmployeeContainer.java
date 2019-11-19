package com.cg.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.core2.Employee2;

public class EmployeeContainer {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
		
	}
}

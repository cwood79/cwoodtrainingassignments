package com.cg.core2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeContainer {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee2 e = (Employee2) context.getBean("emp3");
		System.out.println(e);
	}
}

package com.cg.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerContainer {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer c = (Customer)context.getBean(Customer.class);
		c.setName("nagaraju setti");
		System.out.println(c);
		
	}
}

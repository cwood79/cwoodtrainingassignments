package com.cg.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean 
	public Customer getCustomer() {
		return new Customer();
	}
}

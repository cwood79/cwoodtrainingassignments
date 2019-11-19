package com.cg.core3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SBUConfig {

	@Bean
	public Employee3 getEmployee()
	{
		return new Employee3();
		
	}
	
	@Bean
	public SBU2 getSBU()
	{
		return new SBU2();
	}
}

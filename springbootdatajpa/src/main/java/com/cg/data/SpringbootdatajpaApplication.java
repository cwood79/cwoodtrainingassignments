package com.cg.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.bean.Product;

@SpringBootApplication
@ComponentScan(basePackages="com.cg")
@EnableJpaRepositories(basePackages="com.cg.repo")
@EntityScan(basePackageClasses=Product.class)
public class SpringbootdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatajpaApplication.class, args);
	}

}

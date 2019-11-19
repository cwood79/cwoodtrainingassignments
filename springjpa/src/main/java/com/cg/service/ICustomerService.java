package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.bean.Customer;

@Service
public interface ICustomerService {

	public List<Customer> getAll();
	public void add(Customer c);
}

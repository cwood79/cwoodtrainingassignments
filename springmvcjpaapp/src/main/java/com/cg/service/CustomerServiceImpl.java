package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bean.Customer;
import com.cg.dao.ICustomerDAO;

@Component
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDAO dao;
	
	@Transactional
	public List<Customer> getAll() {
		return dao.findAll();
	}

	@Transactional
	public void add(Customer c) {
		dao.save(c);
		
	}

	
}

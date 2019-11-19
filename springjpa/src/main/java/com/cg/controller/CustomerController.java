package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	@RequestMapping("/all")
	public String getAll(Model m) {
		m.addAttribute("customers", service.getAll());
		return "home";
	}
}

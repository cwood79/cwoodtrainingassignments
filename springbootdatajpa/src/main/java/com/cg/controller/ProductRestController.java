package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Product;
import com.cg.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@RequestBody Product p) {
		service.addProduct(p);
		return "added successfully";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public String update(@PathVariable("id") Integer id, @RequestBody Product p) {
		
		service.updateProduct(id, p);
		return "updated...";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String update(@PathVariable("id") Integer id) {
		
		service.deleteProduct(id);
		return "deleted...";
	}
}

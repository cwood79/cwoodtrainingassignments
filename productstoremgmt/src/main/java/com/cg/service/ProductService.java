package com.cg.service;

import java.util.List;

import com.cg.bean.Product;
import com.cg.dao.ProductDAO;

public class ProductService {
	
	ProductDAO dao = new ProductDAO();
	
	public void add(Product p) {
		dao.add(p);	
	}
	
	public void update(Product p) {
		dao.update(p);
	}
	
	public List<Product> getAll() {
		return dao.getAll();
	}
	
	public void remove(Integer id) {
		dao.remove(id);
	}
}

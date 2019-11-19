package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Product;
import com.cg.repo.IProductRepo;

@Service
public class ProductService {
	
	@Autowired
	IProductRepo repo;
	
	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	public void addProduct(Product p) {
		repo.save(p);
	}
	
	public void updateProduct(Integer id, Product p) {
		Optional<Product> opt=repo.findById(id);
		Product pro = opt.get();
		pro.setName(p.getName());
		pro.setPrice(p.getPrice());
		repo.save(pro);
	}
	
	public void deleteProduct(Integer id) {
		Optional<Product> opt=repo.findById(id);
		Product pro = opt.get();
		repo.delete(pro);
	}
	
	
}

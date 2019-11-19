package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
	
}

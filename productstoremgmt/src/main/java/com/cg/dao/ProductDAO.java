package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cg.bean.Product;

public class ProductDAO {
	
	List<Product> list = new ArrayList();
	
	public void add(Product p) {
		list.add(p);
	}
	
	public void update(Product p) {
		for(int i=0; i< list.size(); i++) {
			if(p.getId() == list.get(i).getId()) {
				list.set(i, p);
			}
		}
	}
	
	public List<Product> getAll() {
		return list;
	}
	
	public void remove(Integer id) {
		Iterator<Product> it = list.iterator();
		
		while(it.hasNext()) {
			Product p = it.next();
			if (p.getId() == id) {
				it.remove();
			}
		}
		
	}

}

package com.cg.service;

import java.util.List;

import com.cg.bean.Trainee;
import com.cg.dao.TraineeDAO;


public class TraineeService {
	TraineeDAO dao = new TraineeDAO();
	
	public void add(Trainee t) {
		dao.add(t);	
	}
	
	public void update(Trainee t) {
		dao.update(t);
	}
	
	public List<Trainee> getAll() {
		return dao.getAll();
	}
	
	public void remove(Integer id) {
		dao.remove(id);
	}
}

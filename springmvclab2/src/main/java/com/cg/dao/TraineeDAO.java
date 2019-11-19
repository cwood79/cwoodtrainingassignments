package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cg.bean.Trainee;

public class TraineeDAO {
	
	List<Trainee> list = new ArrayList();
	
	public void add(Trainee t) {
		list.add(t);
	}
	
	public void update(Trainee t) {
		for(int i=0; i< list.size(); i++) {
			if(t.getTraineeId() == list.get(i).getTraineeId()) {
				list.set(i, t);
			}
		}
	}
	
	public List<Trainee> getAll() {
		return list;
	}
	
	public void remove(Integer id) {
		Iterator<Trainee> it = list.iterator();
		
		while(it.hasNext()) {
			Trainee t = it.next();
			if (t.getTraineeId() == id) {
				it.remove();
			}
		}
		
	}
	
}

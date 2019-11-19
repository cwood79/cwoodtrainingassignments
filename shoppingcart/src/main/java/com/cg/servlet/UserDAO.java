package com.cg.servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAO {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("shoppingcart");
	static EntityManager entity = factory.createEntityManager();
	
	public static void createUser(User u) {
		entity.getTransaction().begin();
		entity.persist(u);
		entity.getTransaction().commit();
	}
	
	public static User validate(User u) {
		return entity.find(User.class, u.getUsername());
		
		
	}
}

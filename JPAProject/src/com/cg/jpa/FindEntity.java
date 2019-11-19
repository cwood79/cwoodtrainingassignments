package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEntity {
	
	public static void main(String[] args) 
	{
		//step 1: entity manager factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAProject");
		
		//step 2: EntityManager
		EntityManager entity=factory.createEntityManager();
		
		entity.getTransaction().begin();
		// step 3: find entity
		Employee e = entity.find(Employee.class, 102);
		
		System.out.println("Found employee "+e.getName() +" id: "+e.getId());
		
		entity.getTransaction().commit();
		
	}

}

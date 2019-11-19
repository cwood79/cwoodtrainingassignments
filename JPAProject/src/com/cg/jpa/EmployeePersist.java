package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeePersist {

	public static void main (String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAProject");
		
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		Address a = new Address();
		a.setCity("hyderabad");
		a.setStreet("miyapur");
		
		Address a2 = new Address();
		a2.setStreet("street");
		a2.setCity("city");
		
		Employee e = new Employee();
		e.setName("nagaraju");
		e.getAddr().add(a);
		e.getAddr().add(a2);
		
		entity.persist(e);
		System.out.println("Entity persisted");
		
		entity.getTransaction().commit();
		

		
	}

}

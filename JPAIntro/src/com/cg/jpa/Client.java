package com.cg.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	private static Scanner sc=new Scanner(System.in);
	static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAIntro");
		em = factory.createEntityManager();
		
		int choice;
		System.out.println("1.create author");			
		System.out.println("2.find author");
		System.out.println("3.update author");
		System.out.println("4.delete author");
		System.out.println("5. exit");
			
		System.out.println("Enter your choice");
		choice=sc.nextInt();
			
		switch(choice)
		{
			case 1:createAuthor();
			       break;
			case 2:findAuthor();
			        break;
			case 3:updateAuthor();
			 		break;
			case 4:deleteAuthor();
		 			break;
			default:System.out.println("Invalid choice");	   			   
		}
			
		em.close();
		factory.close();
	}
	
	public static void createAuthor()
	{
		Author author = new Author();
		
		System.out.println("Enter authorID");
		int authorID =sc.nextInt();
		System.out.println("Enter author first name");
		String firstName =sc.next();
		System.out.println("Enter author middle name");
		String middleName=sc.next();
		System.out.println("Enter author last name");
		String lastName=sc.next();
		System.out.println("Enter author phone number");
		String phoneNumber =sc.next();
		
		author.setAuthorId(authorID);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phoneNumber);
		
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		
		System.out.println("Author added"+author.getFirstName());
	}
	
	public static void findAuthor()
	{
		System.out.println("Enter authorID");
		int authorID =sc.nextInt();
		
		em.getTransaction().begin();

		Author author = em.find(Author.class, authorID);
		
		System.out.println("Found author "+author.getFirstName()+" "+author.getLastName());
		em.getTransaction().commit();
	}
	
	public static void updateAuthor()
	{
		System.out.println("Enter authorID");
		int authorID =sc.nextInt();
		System.out.println("Enter author first name");
		String firstName =sc.next();
		System.out.println("Enter author middle name");
		String middleName=sc.next();
		System.out.println("Enter author last name");
		String lastName=sc.next();
		System.out.println("Enter author phone number");
		String phoneNumber =sc.next();
	
		em.getTransaction().begin();
		Author author = em.find(Author.class, authorID);
		
		System.out.println("before update");
		System.out.println("Author ID: "+author.getAuthorId());
		System.out.println("Name: "+author.getFirstName()+ " "+author.getMiddleName()+" "+author.getLastName());
		System.out.println("Phone Number: "+ author.getPhoneNo());
		
		author.setAuthorId(authorID);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phoneNumber);
		
		System.out.println("after1 update");
		System.out.println("Author ID: "+author.getAuthorId());
		System.out.println("Name: "+author.getFirstName()+ " "+author.getMiddleName()+" "+author.getLastName());
		System.out.println("Phone Number: "+ author.getPhoneNo());

		em.getTransaction().commit();
	}
	
	public static void deleteAuthor()
	{
		System.out.println("Enter authorID");
		int authorID =sc.nextInt();
		
		em.getTransaction().begin();
		Author author = em.find(Author.class, authorID);
		em.remove(author);
		
		System.out.println("Entity removed");

		em.getTransaction().commit();
	}
}


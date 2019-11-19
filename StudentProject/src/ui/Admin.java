package ui;
import java.util.Scanner;

import student.StudentSchedular;

public class Admin {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();
	
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int choice;
		
		while(true)
		{
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.show all students by course");
			System.out.println("4.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:addStudentDetails();
			       break;
			       
			 case 2:showAllStudents();
			        break;
			 case 3:showAllStudentsByCourse();
			 		break;
			 default:System.out.println("Sorry entered wrong choice");
				   
			  
				   
			   
			}
			
		}
		
	}

	private static void showAllStudents() {
		studSch.showAllStudents();
		
	}
	
	private static void showAllStudentsByCourse() {
		
		System.out.println("Enter course");
		String course =sc.next();
		studSch.showAllStudentsByCourse(course);
		
	}

	private static void addStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("How many courses do you want to register");
		int regnum=sc.nextInt();
		if(regnum>0)
		{
			String[] courses = new String[regnum];
			for(int i=0; i<regnum; i++)
			{
				System.out.println("Enter course");
				String course=sc.next();
				courses[i]=course;
			}
			
			System.out.println(studSch.addStudent(rollNumber, name, courses));
		
		}
		else
		{
			System.out.println("Invalid regnum, student not added");
		}	
		
	}

}
package com.capgemini.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidEmployeeIDException;
import com.capgemini.repo.EmployeeRepository;
import com.capgemini.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee createEmployee(String name, String role, int salary, int id) throws InvalidEmployeeIDException, SQLException
	{
		Employee emp=new Employee(name,role,salary,id);
		
		employeeRepository.addEmployee(emp);
		
		return emp;
	}
	
	@Override
	public void findEmployeeBySalaryRange(int low, int high) throws SQLException
	{
		
		ArrayList<Employee> employeeList=employeeRepository.findEmployeesBySalary(low,high);
		
		for(Employee emp: employeeList)
		{
			System.out.println(emp.getName());
			System.out.println(emp.getPosition());
			System.out.println(emp.getID());
			System.out.println(emp.getSalary());
		}
		
		
	}
	
	@Override
	public void findEmployeeByJoinDate(int low, int high) throws SQLException 
	{
		
		ArrayList<Employee> employeeList=employeeRepository.findEmployeesByDate(low,high);
		
		for(Employee emp: employeeList)
		{
			System.out.println(emp.getName());
			System.out.println(emp.getPosition());
			System.out.println(emp.getID());
			System.out.println(emp.getSalary());
		}
		
	}

}

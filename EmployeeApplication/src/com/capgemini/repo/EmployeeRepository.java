package com.capgemini.repo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidEmployeeIDException;

public interface EmployeeRepository {
	boolean addEmployee(Employee employee) throws InvalidEmployeeIDException, SQLException;
	Employee findEmployee(int id) throws SQLException;
	ArrayList<Employee> findEmployeesBySalary(int low, int high) throws SQLException;
	ArrayList<Employee> findEmployeesByDate(int low, int high) throws SQLException;
	boolean deleteEmployee(int id) throws SQLException;
	
}

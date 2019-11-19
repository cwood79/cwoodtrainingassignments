package com.capgemini.service;

import java.sql.SQLException;
import java.util.Date;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidEmployeeIDException;

public interface EmployeeService {
	Employee createEmployee(String name, String role, int salary, int id) throws InvalidEmployeeIDException, SQLException;
	
	void findEmployeeBySalaryRange(int low, int high) throws SQLException;
	
	void findEmployeeByJoinDate(int low, int high) throws SQLException;
	
	
	
}

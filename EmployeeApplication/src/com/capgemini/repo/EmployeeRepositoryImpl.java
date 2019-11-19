package com.capgemini.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidEmployeeIDException;
import com.capgemini.utility.DatabaseUtility;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public boolean addEmployee(Employee employee) throws InvalidEmployeeIDException, SQLException
	{
		if(findEmployee(employee.getID())!=null)
		{
			throw new InvalidEmployeeIDException();
		}
		
		try {
			Connection conn=DatabaseUtility.getConnection();
			
			
			Statement stmt = conn.createStatement();
			stmt=conn.createStatement();
			
			String sql= "INSERT INTO employees " +
						"VALUES ("+employee.getID()+", "+employee.getName()+", "
								+employee.getPosition()+", "+employee.getSalary()+");";
			stmt.executeUpdate(sql);
		} catch (SQLException e) { }
	
		return true;
	}

	@Override
	public Employee findEmployee(int id) throws SQLException
	{
		Connection conn=DatabaseUtility.getConnection();
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs;	
		rs=stmt.executeQuery("SELECT empID, name, position, salary FROM employees WHERE empID="+id);
		
		int empID=0;
		String name="";
		String position="";
		int salary=0;
		
		while(rs.next()) {
			empID=rs.getInt(1);
			name=rs.getString(2);
			position=rs.getString(3);
			salary=rs.getInt(4);
		}
		
		if(isResultSetEmpty(rs))
		{
			return null;
		}
		
		else
		{
			return new Employee(name,position,empID,salary);
		}
		
	}
	
	@Override
	public ArrayList<Employee> findEmployeesBySalary(int low, int high) throws SQLException
	{
		Connection conn=DatabaseUtility.getConnection();
		
		Statement stmt = conn.createStatement();
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		
		ResultSet rs;	
		rs=stmt.executeQuery("SELECT empID, name, position, salary FROM employees WHERE empID BETWEEN " + low + " AND " + high);
		
		while(rs.next()) 
		{
			int empID=rs.getInt(1);
			String name=rs.getString(2);
			String position=rs.getString(3);
			int salary=rs.getInt(4);
			employeeList.add(new Employee(name,position,salary, empID));
		}
		
		return employeeList; 
	}
	
	@Override
	public ArrayList<Employee> findEmployeesByDate(int low, int high) throws SQLException
	{
		Connection conn=DatabaseUtility.getConnection();
		
		Statement stmt = conn.createStatement();
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		ResultSet rs;	
		rs=stmt.executeQuery("SELECT empID, name, position, salary FROM employees WHERE empID BETWEEN " + low + " AND " + high);
		
		while(rs.next()) 
		{
			int empID=rs.getInt(1);
			String name=rs.getString(2);
			String position=rs.getString(3);
			int salary=rs.getInt(4);
			employeeList.add(new Employee(name,position,salary, empID));
		}
		
		return employeeList; 

	}
	
	@Override
	public boolean deleteEmployee(int id) throws SQLException
	{
		throw new SQLException();
	}
	
	public static boolean isResultSetEmpty(ResultSet rs) throws SQLException {
	    return (!rs.isBeforeFirst() && rs.getRow() == 0);
	}

}

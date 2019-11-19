package com.capgemini.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {
	
	static Connection conn;
	public DatabaseUtility() { }
	
	public void createConnection() throws ClassNotFoundException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","password");
			
			
		} catch(Exception e) { System.out.println("Class name not found"+e);}
	}
	
	public static Connection getConnection()
	{
		return conn;
	}
	
	public void closeConnection() throws SQLException
	{
		conn.close();
	}
	
	
}

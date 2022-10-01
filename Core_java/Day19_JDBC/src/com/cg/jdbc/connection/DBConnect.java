package com.cg.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//To connect Eclipse with MySQL server.
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "prashant@23";
		String query = "SELECT * FROM students";
		//if any exception will occur in driver class that will be handled by using catch block
		// if class name of the driver is incorrect, Then it will throw an exception.
		try 
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			
		Connection c= DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery(query);
		while(r.next())
		{
			String data = " ";
			for(int i=1;i<=2;i++)
			{
				data = data+" "+r.getString(i);
			}
			System.out.println(data);
		}
	}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/Username/Password");
			e.printStackTrace();
		}
}
}
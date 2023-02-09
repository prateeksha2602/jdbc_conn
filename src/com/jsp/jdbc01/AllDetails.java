package com.jsp.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllDetails {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jspider";
	String username="root";
	String password="root";
	String sql="SELECT * FROM student";
	
	try {
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection connection=DriverManager.getConnection(url, username, password);
		
		
		//Create statement
		Statement statement= connection.createStatement();
		
		//Execute statement
		ResultSet resultSet= statement.executeQuery(sql);
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("=========4");
		}
		
		//close the statement
		connection.close();
		System.out.println("all good");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit";
		String username ="root";
		String password="Thunder77*";
		Connection connection= DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps=connection.prepareStatement("insert into infosys values(?,?,?,?,?)");
		ps.setInt(1, 1023);
		ps.setString(2, "Asad");
		ps.setInt(3, 53000);
		ps.setInt(4, 26);
		ps.setString(5, "Mumbai");
		ps.executeUpdate();
		}
	}



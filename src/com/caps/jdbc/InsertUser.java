package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		//Load the driver
		try {
			//Driver driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			//Get the DB Connection
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dburl,user,password);
			System.out.println("Connection has been established");
			String query="insert into users_info values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter user id");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter user name ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter Email ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter Passowrd ");
			pstmt.setString(4, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count!=0)
			{
				System.out.println("Profile updated...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Close all JDBC objects
		
	finally
	{
		try
		{
			if(con!=null)
			{
				con.close();;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(pstmt!=null)
			{
				pstmt.close();;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}

}
package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserEmailUpdate 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Connection conn= null;
	PreparedStatement pstmt= null;
	
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded....");
			
			//Get DB Connection
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn=DriverManager.getConnection(dburl,user,password);
			
			
			//Issue SQL Querry
			String query="update users_info set email = ? where userid = ? and password = ?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter User ID....");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter the new Email");
			pstmt.setString(1,sc.nextLine());
			
			System.out.println("Enter the password");
			pstmt.setString(3,sc.nextLine());
			
			int count=pstmt.executeUpdate();
			System.out.println("Querry is issued...");
			
			
			//Process the results returned
			if(count>0)
			{
				System.out.println("Query OK,"+count+"Rows affected");
			}
			else
			{
				System.out.println("Something went wrong");
			}
			sc.close();
			System.out.println("Querry issued..");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Close all the JDBC Objects
		
	}
}
	

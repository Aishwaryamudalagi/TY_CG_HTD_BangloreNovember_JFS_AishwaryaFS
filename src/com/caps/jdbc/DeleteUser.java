package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUser 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		//Load the driver
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			//Get the Db Connection
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dburl,user,password);
			System.out.println("Connection has been established");
			//Issue SQL querry
			String query="delete from users_info where userid=? and password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter user id...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password id...");
			pstmt.setString(2,sc.nextLine());
			int count=pstmt.executeUpdate();
			//Process the results returned
			if(count>0)
			{
				System.out.println("User Deleted");
			}
			else
			{
				System.out.println("Something went wrong");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
		
		
		
		//Close all JDBC objects
	}

}

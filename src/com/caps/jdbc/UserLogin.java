package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//Load the driver
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded...");
			
		//Establish connection to DB via driver
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbuser=sc.nextLine();
			String dbpass=sc.nextLine();
			con=DriverManager.getConnection(dburl,dbuser,dbpass);
			System.out.println("Conection established...");
			
		//Issue an sql querry via Connection
			String query=" select * from users_info" + " where userid=? and password=? ";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userid...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password..");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
			System.out.println("Querry issued and executed....");
			
		//Process the result
			if(rs.next())
			{
				System.out.println("Userid :"+ rs.getInt(1));
				System.out.println("Usernmae :" +rs.getString(2));
				System.out.println("Email :" +rs.getString(3));
			} else {
				System.out.println("ghjk");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//Close all JDBC objects
		finally
		{
			try
			{
				if(con!=null)
					con.close();
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
			try
			{
				if(pstmt!=null)
					pstmt.close();
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
			try
			{
				if(rs!=null)
					rs.close();
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}



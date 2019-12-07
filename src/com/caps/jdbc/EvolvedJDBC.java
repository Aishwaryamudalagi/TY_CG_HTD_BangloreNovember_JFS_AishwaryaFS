package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;

public class EvolvedJDBC 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String dburl = "jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("Enter DB user and Password");
		String user = sc.nextLine();
		String password = sc.nextLine();
		String query="select * from users_info";
		try(Connection conn = DriverManager.getConnection(dburl,user,password); 
				Statement stmt=conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next())
			{
				System.out.println("user id:"+rs.getInt(1));
				System.out.println("user name:"+rs.getString("username"));
				System.out.println("email:"+rs.getString(3));
				System.out.println("------------------");
			}
			sc.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
		

}

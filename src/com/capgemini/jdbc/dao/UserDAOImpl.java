package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOImpl implements UserDAO 
{
	FileReader reader;
	Properties prop;
	UserBean user;
	public UserDAOImpl()
	{
		try {
			
			reader = new FileReader("db.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> getAllUsers() {

		List<UserBean> list = new ArrayList<UserBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				user=new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
			}
			return list;
		
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(UserBean user) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery")))
		{
				
				pstmt.setInt(2, user.getUserid());
				
				pstmt.setString(1, user.getEmail());
				pstmt.setString(3, user.getPassword());
				int count = pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
			
	   }catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery")))
		{
				
				pstmt.setInt(1, user.getUserid());
				pstmt.setString(2, user.getUsername());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPassword());
				int count = pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
			
	   }catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public boolean deleteUser(UserBean user) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery")))
		{
				
				pstmt.setInt(1, user.getUserid());
				
				pstmt.setString(2, user.getPassword());
				int count = pstmt.executeUpdate();
		
				
				if(count>0) {
					return true;
				}
			
	   }catch(Exception e) {
			e.printStackTrace();
			 
		}
		
		return false;
	}
	
	

}

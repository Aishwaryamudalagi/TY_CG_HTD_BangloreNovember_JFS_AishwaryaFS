package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.UserInfo;

public interface UserDAO {
	public boolean register(UserInfo account);
	public UserInfo login(UserInfo credentials);
	public boolean addUser(UserInfo user);

	public UserInfo getUser(int id);

	public List<UserInfo> getAllUsers();

	public boolean deleteUser(int id);

	public boolean modifyUser(int id,String Password);

}
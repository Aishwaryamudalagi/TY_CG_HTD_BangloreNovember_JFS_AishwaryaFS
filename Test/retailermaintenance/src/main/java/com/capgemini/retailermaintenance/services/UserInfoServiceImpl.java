package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.UserDAO;
import com.capgemini.retailermaintenance.dto.UserInfo;
@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserDAO dao;

	@Override
	public boolean register(UserInfo account) {
		
		return dao.register(account);
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		
		return dao.login(credentials);
	}

	@Override
	public boolean addUser(UserInfo user) {
		
		return dao.addUser(user);
	}

	@Override
	public UserInfo getUser(int id) {
		
		return dao.getUser(id);
	}

	@Override
	public List<UserInfo> getAllUsers() {
		
		return dao.getAllUsers();
	}

	@Override
	public boolean deleteUser(int id) {
		
		return dao.deleteUser(id);
	}

	@Override
	public boolean modifyUser(int id, String Password) {
		
		return dao.modifyUser(id,Password);
	}

}

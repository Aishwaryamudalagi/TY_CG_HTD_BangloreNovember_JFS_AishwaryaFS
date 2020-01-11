package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.dto.UserInfoResponse;
import com.capgemini.retailermaintenance.services.ProductInfoService;
import com.capgemini.retailermaintenance.services.UserInfoService;

@RestController
public class UserController {
	@Autowired
	UserInfoService service;
	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse register(@RequestBody UserInfo account) {
		UserInfoResponse response = new UserInfoResponse();
		service.register(account);
		response.setStatusCode(201);
		response.setDescription("Success");
		response.setMessage("Account created");
		return response;
	}
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestBody UserInfo credentials) {
		UserInfoResponse response = new UserInfoResponse();
		UserInfo account = service.login(credentials);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setUserInfo(Arrays.asList(account));
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}
	@PostMapping(path = "/add-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse addUser(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		if (service.addUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}
	@DeleteMapping(path = "/delete-user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse deleteUser(@PathVariable("id") int id) {
		UserInfoResponse response = new UserInfoResponse();
		if (service.deleteUser(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found");
		}
		return response;
	}
	@PutMapping(path = "/modify-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse modifyUser(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		if (service.modifyUser(user.getId(), user.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product cost updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found");
		}
		return response;
	}
	@GetMapping(path = "/view-allusers", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse getAllUsers() {
		UserInfoResponse response = new UserInfoResponse();
		List<UserInfo> list = service.getAllUsers();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found");
			response.setUserInfo(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}


}

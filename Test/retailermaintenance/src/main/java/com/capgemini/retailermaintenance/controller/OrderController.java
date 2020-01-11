package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.OrderInfoResponse;
import com.capgemini.retailermaintenance.services.OrderInfoService;


@RestController
public class OrderController {
	@Autowired
	OrderInfoService service;
	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse addOrder(@RequestBody OrderInfo order) {
		OrderInfoResponse response = new OrderInfoResponse();
		if (service.addOrder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order with same Id already exists");
		}
		return response;
	}
	@GetMapping(path = "/view-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse getOrder(@RequestParam("id") int id) {
		OrderInfoResponse response = new OrderInfoResponse();
		OrderInfo product = service.getOrder(id);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order not found");
			response.setOrders(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order does not exist");
		}
		return response;
	}
	@GetMapping(path = "/view-allorders", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse getAllOrders() {
		OrderInfoResponse response = new OrderInfoResponse();
		List<OrderInfo> list = service.getAllOrders();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Orders found");
			response.setOrders(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

}

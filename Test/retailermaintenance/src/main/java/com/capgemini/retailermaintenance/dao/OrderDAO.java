package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderInfo;

public interface OrderDAO {
	public boolean addOrder(OrderInfo product);

	public OrderInfo getOrder(int id);

	public List<OrderInfo> getAllOrders();

	public boolean deleteOrder(int id);


}

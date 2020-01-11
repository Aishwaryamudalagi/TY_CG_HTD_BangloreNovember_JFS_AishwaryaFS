package com.capgemini.retailermaintenance.services;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.ProductInfo;

public interface OrderInfoService {
	public boolean addOrder(OrderInfo product);

	public OrderInfo getOrder(int id);

	public List<OrderInfo> getAllOrders();

	public boolean deleteOrder(int id);

}

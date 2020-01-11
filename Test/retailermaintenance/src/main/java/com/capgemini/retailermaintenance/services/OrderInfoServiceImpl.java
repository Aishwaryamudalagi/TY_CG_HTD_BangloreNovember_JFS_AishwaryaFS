package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.OrderDAO;
import com.capgemini.retailermaintenance.dto.OrderInfo;
@Service
public class OrderInfoServiceImpl implements OrderInfoService{
	@Autowired
	private OrderDAO dao;

	@Override
	public boolean addOrder(OrderInfo order) {
		// TODO Auto-generated method stub
		return dao.addOrder(order);
	}

	@Override
	public OrderInfo getOrder(int id) {
		// TODO Auto-generated method stub
		return dao.getOrder(id);
	}

	@Override
	public List<OrderInfo> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.getAllOrders();
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return dao.deleteOrder(id);
	}

}

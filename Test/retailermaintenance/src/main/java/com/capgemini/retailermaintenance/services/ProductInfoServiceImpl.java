package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.ProductDAO;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;
@Service
public class ProductInfoServiceImpl implements ProductInfoService{
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public ProductInfo getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(id);
	}

	
	

}

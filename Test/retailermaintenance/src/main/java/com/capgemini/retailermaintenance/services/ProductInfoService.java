package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;

public interface ProductInfoService {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

	public boolean deleteProduct(int id);


}
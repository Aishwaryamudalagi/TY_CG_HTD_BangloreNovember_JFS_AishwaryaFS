package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.ProductInfo;

public interface ProductDAO {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

	public boolean deleteProduct(int id);

}

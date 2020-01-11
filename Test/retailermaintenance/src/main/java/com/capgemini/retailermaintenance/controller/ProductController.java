package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.ProductInfoResponse;
import com.capgemini.retailermaintenance.services.ProductInfoService;



@RestController
public class ProductController {
	@Autowired
	ProductInfoService service;
	
	@PostMapping(path = "/add-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse addProduct(@RequestBody ProductInfo product) {
		ProductInfoResponse response = new ProductInfoResponse();
		if (service.addProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product with same name already exists");
		}
		return response;
	}
	
	@GetMapping(path = "/view-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getProduct(@RequestParam("id") int id) {
		ProductInfoResponse response = new ProductInfoResponse();
		ProductInfo product = service.getProduct(id);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(product));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}
	
	@GetMapping(path = "/view-allproducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse getAllProducts() {
		ProductInfoResponse response = new ProductInfoResponse();
		List<ProductInfo> list = service.getAllProducts();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
	}
		@DeleteMapping(path = "/delete-product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductInfoResponse deleteProduct(@PathVariable("id") int id) {
			ProductInfoResponse response = new ProductInfoResponse();
			if (service.deleteProduct(id)) {
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

	}


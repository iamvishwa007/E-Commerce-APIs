package com.e_commerce.e_commerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.e_commerce_api.model.Product;
import com.e_commerce.e_commerce_api.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	 public Product addProduct(Product product) {
	        return productRepo.save(product);
	    }

	    public List<Product> getAllProducts() {
	        return productRepo.findAll();
	    }

	    public Product getProductById(Long id) {
	        return productRepo.findById(id).orElse(null);
	    }

}

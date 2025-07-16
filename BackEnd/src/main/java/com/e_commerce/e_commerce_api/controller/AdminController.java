package com.e_commerce.e_commerce_api.controller;


import com.e_commerce.e_commerce_api.model.Product;
import com.e_commerce.e_commerce_api.model.User;
import com.e_commerce.e_commerce_api.service.ProductService;
import com.e_commerce.e_commerce_api.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
    private ProductService productService;
	
	@Autowired
    private UserService userService;
	    @PostMapping("/products")
	    public Product addProduct(@RequestBody Product product) {
	        return productService.addProduct(product);
	    }

	    @PutMapping("/products/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
	        return productService.updateProduct(id, product);
	    }

	    @DeleteMapping("/products/{id}")
	    public String deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	        return "Product deleted successfully";
	    }

	    @GetMapping("/allusers")
	    public List<User> getUsers() {
	        return userService.getAllUsers();
	    }
	    
}

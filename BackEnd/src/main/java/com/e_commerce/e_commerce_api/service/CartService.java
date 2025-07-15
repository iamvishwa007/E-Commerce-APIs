package com.e_commerce.e_commerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.e_commerce_api.model.Cart;
import com.e_commerce.e_commerce_api.repository.CartItemRepo;

@Service
public class CartService {
	  
	
	 @Autowired
	    private CartItemRepo cartRepo;

	    public Cart addToCart(Cart item) {
	        return cartRepo.save(item);
	    }

	    public List<Cart> getCartByUserId(Long userId) {
	        return cartRepo.findByUserId(userId);
	    }

	    public void removeItem(Long itemId) {
	        cartRepo.deleteById(itemId);
}
}

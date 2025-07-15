package com.e_commerce.e_commerce_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.e_commerce.e_commerce_api.model.Cart;

public interface CartItemRepo extends JpaRepository<Cart,Long> {

	List<Cart> findByUserId(Long userId);

	
}

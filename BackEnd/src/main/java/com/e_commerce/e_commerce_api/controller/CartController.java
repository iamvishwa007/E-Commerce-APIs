package com.e_commerce.e_commerce_api.controller;

import com.e_commerce.e_commerce_api.model.Cart;
import com.e_commerce.e_commerce_api.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
    private CartService cartService;

    @PostMapping
    public Cart addToCart(@RequestBody Cart item) {
        return cartService.addToCart(item);
    }

    @GetMapping("/{userId}")
    public List<Cart> getUserCart(@PathVariable Long userId) {
        return cartService.getCartByUserId(userId);
    }

    @DeleteMapping("/{itemId}")
    public void removeItem(@PathVariable Long itemId) {
        cartService.removeItem(itemId);
    }
}

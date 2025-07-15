package com.e_commerce.e_commerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.e_commerce.e_commerce_api.model.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {

}

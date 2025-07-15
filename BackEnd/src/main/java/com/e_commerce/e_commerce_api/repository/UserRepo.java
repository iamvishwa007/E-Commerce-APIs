package com.e_commerce.e_commerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.e_commerce.e_commerce_api.model.User;


public interface UserRepo extends JpaRepository<User,Long> {
   User findByUsername(String name);
}
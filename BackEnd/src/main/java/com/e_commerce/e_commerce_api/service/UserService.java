package com.e_commerce.e_commerce_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.e_commerce_api.model.User;
import com.e_commerce.e_commerce_api.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getUserByUsername(String name) {
		return userRepo.findByUsername(name);
	}
	

}

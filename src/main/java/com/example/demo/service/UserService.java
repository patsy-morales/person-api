package com.example.demo.service;

import java.util.List;


import com.example.demo.models.User;

public interface UserService {
	User addUser(User user);
	
	List<User> allUsers();
	
	User getUserById(Long id);
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public User adduser(@RequestBody User user)
	{
		return userservice.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userservice.allUsers();
	}
	
	@GetMapping("user/{id}")
	public User getUserById(@PathVariable Long id) {
		System.out.println(id);
		
		return userservice.getUserById(id);
		
	}
}

package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		System.out.println("create user");
		return userRepository.save(user);
		
	}
	
	@Override
	public List<User> allUsers(){
		
		return userRepository.findAll();
		
	}
	
	@Override
	public User getUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
	       
	}
	

}

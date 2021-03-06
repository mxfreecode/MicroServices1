package com.user.app.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.app.entity.User;
import com.user.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public ArrayList<User> getUsers(){
		return (ArrayList<User>) userRepository.findAll();
	}
	
	public User saveUsers(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> getById(Integer userId){
		return userRepository.findById(userId);
	}
	
	
	public ArrayList<User> getByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}
	
	public boolean deleteUser(Integer userId) {
		try {
			userRepository.deleteById(userId);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}

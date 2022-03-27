package com.user.app.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.user.app.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public abstract ArrayList<User> findByUsername(String username);
}

package com.oxy.oxygen.service;

import java.util.List;

import com.oxy.oxygen.model.User;

public interface UserService {

	List<User> usersList();
	
	User addUser(User user);
	
	User findUser(Long id);
	
	String deleteUser(Long id);
}

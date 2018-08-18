package com.oxy.oxygen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxy.oxygen.model.User;
import com.oxy.oxygen.repository.UserRepository;
import com.oxy.oxygen.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> usersList() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User findUser(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public String deleteUser(Long id) {
		String msg = "User " + id + " is deleted successfully.";
		userRepository.deleteById(id);
		return msg;
	}
}

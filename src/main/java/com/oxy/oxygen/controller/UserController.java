package com.oxy.oxygen.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oxy.oxygen.model.User;
import com.oxy.oxygen.service.UserService;

@Controller
@RequestMapping(value = "/user")
@Transactional
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@ResponseBody
	@RequestMapping(value="/list")
	public List<User> listOfUsers() {
		return userService.usersList();
	}

	@ResponseBody
	@RequestMapping(value="/list/{id}")
	public User findUser(@PathVariable long id) {
		return userService.findUser(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		return userService.deleteUser(id);
	}
}

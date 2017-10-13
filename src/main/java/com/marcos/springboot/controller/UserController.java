package com.marcos.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User saveUser(@RequestBody User user) {		
		return userService.saveUser(user);
	}
			
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long id) {		
		return userService.findById(id);
	}
}

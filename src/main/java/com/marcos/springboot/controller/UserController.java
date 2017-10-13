package com.marcos.springboot.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springboot.entities.Role;
import com.marcos.springboot.entities.User;
import com.marcos.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User saveUser() {		
		User user = new User();
		user.setPassword("123");
		user.setPasswordConfirm("123");
		user.setUsername("markos");
		
		Set<Role> roles = new HashSet<>();
		Role role = new Role();
		role.setId(1L);
		roles.add(role);
		user.setRoles(roles);
		
		return userService.saveUser(user);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long id) {		
		return userService.findById(id);
	}
}

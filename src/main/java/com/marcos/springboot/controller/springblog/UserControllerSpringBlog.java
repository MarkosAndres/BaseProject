package com.marcos.springboot.controller.springblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.repository.querydsl.springblog.UserServiceSpringBlog;

@RestController
@RequestMapping("spring-blog")
public class UserControllerSpringBlog {
	
	@Autowired
	private UserServiceSpringBlog userServiceSpringBlog;
	
	@RequestMapping(value = "/user")
	public Iterable<User> getUsers() {		
		return userServiceSpringBlog.findUsers();
	}

}

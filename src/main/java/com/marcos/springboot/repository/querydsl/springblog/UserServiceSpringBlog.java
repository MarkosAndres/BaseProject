package com.marcos.springboot.repository.querydsl.springblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.springboot.entities.User;

@Service
public class UserServiceSpringBlog {

	@Autowired
	private UserRepositorySpringBlog userRepositorySpringBlog;
	
	public Iterable<User> findUsers(){
		Iterable<User> users = userRepositorySpringBlog.findUsers();
		
		return users;
	}
}

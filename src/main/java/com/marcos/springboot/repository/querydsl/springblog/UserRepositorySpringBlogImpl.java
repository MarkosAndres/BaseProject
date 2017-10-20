package com.marcos.springboot.repository.querydsl.springblog;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcos.springboot.entities.QUser;
import com.marcos.springboot.entities.User;
import com.querydsl.core.types.dsl.BooleanExpression;

public class UserRepositorySpringBlogImpl implements UserRepositoryCustomSpringBlog {
	
	@Autowired
	private UserRepositorySpringBlog userRepositorySpringBlog;

	@Override
	public Iterable<User> findUsers() {
		
		QUser qUser = QUser.user;
		
		BooleanExpression isPassword = qUser.password.eq("test");
		BooleanExpression isUsername = qUser.username.eq("markos");
		
		return userRepositorySpringBlog.findAll(isPassword.and(isUsername));
	}

}

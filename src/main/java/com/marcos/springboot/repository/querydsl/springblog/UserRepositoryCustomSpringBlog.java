package com.marcos.springboot.repository.querydsl.springblog;

import com.marcos.springboot.entities.User;

public interface UserRepositoryCustomSpringBlog {

	Iterable<User> findUsers();
}

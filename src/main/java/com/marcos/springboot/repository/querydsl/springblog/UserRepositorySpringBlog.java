package com.marcos.springboot.repository.querydsl.springblog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.marcos.springboot.entities.User;

public interface UserRepositorySpringBlog extends JpaRepository<User, Long>, QueryDslPredicateExecutor<User>, UserRepositoryCustomSpringBlog {

}

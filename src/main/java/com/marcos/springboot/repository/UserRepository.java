package com.marcos.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.repository.custom.UserRepositoryCustom;

public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {
	
	User findByUsername(String username);
}

package com.marcos.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcos.springboot.entities.User;
import com.marcos.springboot.repository.custom.HomeRepositoryCustom;

@Repository
public interface HomeRepository extends CrudRepository<User, Long>, HomeRepositoryCustom {
	
}

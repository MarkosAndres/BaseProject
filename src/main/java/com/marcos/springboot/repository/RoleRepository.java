package com.marcos.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.marcos.springboot.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

}

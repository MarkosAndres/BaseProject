package com.marcos.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.springboot.entities.Role;
import com.marcos.springboot.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public Role findRole(long id) {
		return roleRepository.findOne(id);
	}

	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}
}

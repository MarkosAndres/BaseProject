package com.marcos.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springboot.entities.Role;
import com.marcos.springboot.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/role/{id}")
	public Role getRole(@PathVariable long id) {
		return roleService.findRole(id);
	}

	@RequestMapping(value="/role", method=RequestMethod.POST)
	public Role saveRole(@RequestBody Role role) {		
		return roleService.saveRole(role);
	}
}

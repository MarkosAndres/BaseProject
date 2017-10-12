package com.marcos.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springboot.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@RequestMapping(value="/")
	public String home() {
		return homeService.getMessageFromService();
	}
}

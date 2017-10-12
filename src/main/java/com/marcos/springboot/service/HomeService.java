package com.marcos.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.springboot.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepository homeRepository;

	public String getMessageFromService() {
		return homeRepository.getMessageFromRepository();
	}
}

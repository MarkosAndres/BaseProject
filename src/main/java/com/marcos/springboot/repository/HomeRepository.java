package com.marcos.springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

	public String getMessageFromRepository() {
		return "home repository";
	}
}

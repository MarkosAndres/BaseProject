package com.marcos.springboot.repository.custom;

public class HomeRepositoryImpl implements HomeRepositoryCustom {

	@Override
	public String getMessageFromRepository() {
		return "response crud repository";
	}

}

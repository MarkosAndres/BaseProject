package com.marcos.springboot.repository.custom;

public class UserRepositoryImpl implements UserRepositoryCustom {

	@Override
	public String getMessageFromRepository() {
		return "response crud repository";
	}

}

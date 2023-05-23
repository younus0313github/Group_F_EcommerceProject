package com.ecommerce.service;

import java.util.Optional;

import com.ecommerce.model.UserGet;

public interface UserGetService {
	
	public Optional<UserGet> getUserById(Integer id);

}

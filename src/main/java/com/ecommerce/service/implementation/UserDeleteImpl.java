package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.UserDeleteRepository;
import com.ecommerce.service.UserDeleteService;

@Service
public class UserDeleteImpl implements UserDeleteService {

	@Autowired
	private UserDeleteRepository userDeleteRepository;

	@Override
	public void deleteUser(Integer id) {
		userDeleteRepository.deleteById(id);

	}

}

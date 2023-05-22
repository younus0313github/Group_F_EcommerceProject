package com.ecommerce.service.implementation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.UserGet;
import com.ecommerce.repository.UserGetRepository;
import com.ecommerce.service.UserGetService;

@Service
public class UserGetServiceImpl implements UserGetService {

	@Autowired
	private UserGetRepository userGetRepository;
	

	@Override
	public Optional<UserGet> getUserById(Integer id) {
			Optional<UserGet> user=userGetRepository.findById(id);
			return user;

	}
}

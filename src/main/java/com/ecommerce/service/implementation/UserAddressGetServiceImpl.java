package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddressGet;
import com.ecommerce.repository.UserAddressGetRepository;
import com.ecommerce.service.UserAddressGetService;


/*Task No 72
 * Design Restful 
 * API to get user address  from database
 * By - Amit waghmare
 */
@Service
public class UserAddressGetServiceImpl implements UserAddressGetService {

	
	//inject repository reference
	@Autowired
	private UserAddressGetRepository userRepository;

	@Override
	public UserAddressGet getUserById(Integer id) {
		UserAddressGet user=userRepository.findById(id);
		return user;
	}
	
	
	}

	

	
	
	
	
	
	
	
	
	




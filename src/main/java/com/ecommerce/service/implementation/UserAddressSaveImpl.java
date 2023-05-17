package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddressSave;
import com.ecommerce.repository.UserAddressSaveRepository;
import com.ecommerce.service.UserAddressSaveService;
/*
 * Task No 70 
 * Design Restful API to add user address into database.
 * By - Shaikh Younus Kalindar
 */
@Service
public class UserAddressSaveImpl implements UserAddressSaveService {

	@Autowired
	private UserAddressSaveRepository userAddressRepository;

	@Override
	public UserAddressSave saveUserAddress(UserAddressSave useraddress) {

		UserAddressSave ua = userAddressRepository.save(useraddress);
		return ua;
	}

}

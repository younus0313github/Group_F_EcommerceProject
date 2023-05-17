package com.ecommerce.service.implementation;
/*Task No 116
 * Design Restful web service which is used 
 * to get category with product details from database
 * By - Shaikh Younus Kalindar
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddressDelete;
import com.ecommerce.repository.UserAddressDeleteRepository;
import com.ecommerce.service.UserAddressDeleteService;

@Service
public class UserAddressDeleteImpl implements UserAddressDeleteService {

	@Autowired
	private UserAddressDeleteRepository userAddressRepository;

	@Override
	public void deleteUserAddress(Integer id) {
		userAddressRepository.deleteById(id);
		//return useradd;
	}

	

}

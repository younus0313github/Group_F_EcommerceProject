package com.ecommerce.service;

import com.ecommerce.model.UserAddressGet;


/*Task No 72
 * Design Restful 
 * API to get user address  from database
 * By - Amit waghmare
 */
public interface UserAddressGetService {

	//based on id
		public UserAddressGet getUserById(Integer id); 

		

	}

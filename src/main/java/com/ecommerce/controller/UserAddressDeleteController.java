package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.repository.UserAddressDeleteRepository;
import com.ecommerce.service.UserAddressDeleteService;
/*Task No 116
 * Design Restful web service which is used 
 * to get category with product details from database
 * By - Shaikh Younus Kalindar
 */
@RestController
public class UserAddressDeleteController {

	@Autowired
	private UserAddressDeleteService userAddressService;

	@DeleteMapping("/delete/{id}")
	public void deleteUserAddressByid(@PathVariable("id") Integer id) throws Exception {
		userAddressService.deleteUserAddress(id);

	}
}
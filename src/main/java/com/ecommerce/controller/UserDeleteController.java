package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.UserDeleteService;

@RestController
public class UserDeleteController {

	@Autowired
	private UserDeleteService userDeleteService;

	@DeleteMapping("/deleteuser/{id}")
	public void deleteByid(@PathVariable Integer id) throws Exception {
		userDeleteService.deleteUser(id);
	}

}

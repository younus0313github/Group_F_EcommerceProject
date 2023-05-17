package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserAddressGet;
import com.ecommerce.service.UserAddressGetService;

/*Task No 72
 * Design Restful 
 * API to get user address  from database
 * By - Amit waghmare
 */
@RestController
public class UserAddressGetController {

	// Inject the service here
	@Autowired
	private UserAddressGetService userService;

	@GetMapping("/getUserDetails/{id}")
	public ResponseEntity<UserAddressGet>  getUserById(@PathVariable("id") Integer id) {
		UserAddressGet user = userService.getUserById(id);
		return  ResponseEntity.ok().body(user);
	}
}

package com.ecommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.model.UserGet;
import com.ecommerce.service.UserGetService;

/*
 * Task No.46
 * Design the web services to fetch all the list of user from database.
 * By- Vaishali Kadam
*/

@RestController
@RequestMapping("/userlist")
public class UserGetController {
	
	@Autowired
	private UserGetService userGetService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<UserGet>> getUserDetails(@PathVariable("id") Integer id) {
		Optional<UserGet> users = userGetService.getUserById(id);

		return ResponseEntity.ok().body(users);


	}
}

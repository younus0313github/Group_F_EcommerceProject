package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserAddressSave;
import com.ecommerce.service.UserAddressSaveService;
/*
 * Task No 70 
 * Design Restful API to add user address into database.
 * By - Shaikh Younus Kalindar
 */
@RestController
public class UserAddressSaveController {
	@Autowired
	public UserAddressSaveService userAddressService;

	@PostMapping("/saveUserAddress")
	public ResponseEntity<UserAddressSave> saveUserAddress(@RequestBody UserAddressSave userAddress) {
		UserAddressSave uadd = userAddressService.saveUserAddress(userAddress);
		return ResponseEntity.ok().body(uadd);

	}

}

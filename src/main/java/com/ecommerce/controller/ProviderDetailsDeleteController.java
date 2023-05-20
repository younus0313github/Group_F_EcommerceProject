package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.ProviderDetailsDeleteService;

@RestController
public class ProviderDetailsDeleteController {

	@Autowired
	private ProviderDetailsDeleteService providerDetailsDeleteService;

	@DeleteMapping("/deletedetails/{id}")
	public void deleteByid(@PathVariable Integer id) throws Exception {
		providerDetailsDeleteService.deleteProviderDetails(id);
	}

}

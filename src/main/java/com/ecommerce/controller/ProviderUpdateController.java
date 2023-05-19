package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.model.ProviderUpdate;
import com.ecommerce.service.ProviderUpdateService;

/*
 * Task No.52
 * Design the Restful web services to update the provider details into database
 * By - Vaishali Kadam
 */

@RestController
@RequestMapping(path = "/provider")
public class ProviderUpdateController {

	// Inject the service here
	@Autowired
	private ProviderUpdateService providerService;

	// Design Rest API to update Provider Details

	@PutMapping("/update/{id}")
	public ProviderUpdate updateProviderDetails(@RequestBody ProviderUpdate provider, @PathVariable("id") Integer id) {
		ProviderUpdate updateProvider = providerService.updateProviderDetails(provider, id);
		return updateProvider;

	}
}

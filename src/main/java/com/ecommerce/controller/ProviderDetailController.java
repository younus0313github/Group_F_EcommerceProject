package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ProviderDetail;
import com.example.service.impl.ProviderDetailService;

@RestController
public class ProviderDetailController {
 @Autowired
	private ProviderDetailService providerDetailService;
 @PostMapping("/SaveProviderData")
	public  ResponseEntity<ProviderDetail> SaveProviderDetails(@RequestBody ProviderDetail providerDetail) {
		ProviderDetail providerDetail2=providerDetailService.SaveProviderDetails(providerDetail);
		return ResponseEntity.ok().body(providerDetail2);
	}
 
}

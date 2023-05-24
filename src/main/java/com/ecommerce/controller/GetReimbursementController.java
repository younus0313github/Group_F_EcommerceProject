package com.ecommerce.controller;

/*
 * Task No.89
 * Design the Restful web services to get the reimbursement 
 * By - Younus K Shaikh
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.GetReimbursement;
import com.ecommerce.service.GetReimbursementService;

@RestController
public class GetReimbursementController {

	@Autowired
	private GetReimbursementService getReimbursementService;

	@GetMapping("/getReimbursement/{Id}")
	public ResponseEntity<GetReimbursement> getReimbursementById(@PathVariable("Id") Integer Id) {
		GetReimbursement gr = getReimbursementService.getReimbursementById(Id);
		return ResponseEntity.ok().body(gr);

	}

}

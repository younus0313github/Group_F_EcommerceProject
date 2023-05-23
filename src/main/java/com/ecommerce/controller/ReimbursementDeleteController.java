package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.service.ReimbursementDeleteService;

/*
 * Task No.90
 * Design the Restful web services to delete the reimbursement 
 * By - Vaishali Kadam
 */

@RestController
@RequestMapping(path = "/reimbursement")
public class ReimbursementDeleteController {

	// inject the service
	@Autowired
	private ReimbursementDeleteService reimbursementDeleteService;

	//Design the Restful web services to delete the reimbursement 
	
	@DeleteMapping("/delete/{reimbursementId}")
	public void deleteById(@PathVariable("reimbursementId") Integer reimbursementId) {

		reimbursementDeleteService.deleteById(reimbursementId);
		System.out.println("Reimbursement deleted successfully");

	}

}

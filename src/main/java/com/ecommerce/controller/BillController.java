package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bill;
import com.ecommerce.service.BillService;
/*
 * Task No.62,63,64
 * Design the Restful web services to add,update and get bill details
 * By- Vaishali Kadam
*/

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	// RestAPI for save Bill Details
	
	@PostMapping("/save")
	public ResponseEntity<Bill> addBill(@RequestBody Bill bill) {
		Bill bl = billService.addBillDetails(bill);

		return ResponseEntity.status(HttpStatus.CREATED).body(bl);
	}

	// RestAPI for Update Bill Details

	@PutMapping("/update/{id}")
	public ResponseEntity<Bill> updateBill(@PathVariable("id") Integer id, @RequestBody Bill bill) {
		Bill updateBill = billService.updateBillDetails(bill, id);
		return ResponseEntity.ok().body(updateBill);

	}

	// RestAPI for get bill Details
	@GetMapping("/get/{id}")
	public ResponseEntity<Bill> getBillDetails(@PathVariable("id") Integer id) {
		Bill bill = billService.getBillDetails(id);

		return ResponseEntity.ok().body(bill);

	}
	
	
	

}

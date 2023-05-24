package com.ecommerce.controller;
/*
 * Task No.69
 * Design Restful API to delete the payment details for purchasing order from user.
 * By - Younus K Shaikh
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.DeletePaymentService;

@RestController
public class DeletePaymentController {

	@Autowired
	private DeletePaymentService deletePaymentService;

	@DeleteMapping("/deleteorder/{id}")
	public void deleteByid(@PathVariable("Id") Integer id) throws Exception{
		deletePaymentService.deleteById(id);
	}

}

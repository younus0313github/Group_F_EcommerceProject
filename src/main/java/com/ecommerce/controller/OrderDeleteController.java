package com.ecommerce.controller;
/*
 * Task No.83
 * Design the Restful web services to delete the order details into database
 * By - Younus K Shaikh
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.OrderDeleteService;

@RestController
public class OrderDeleteController {
	@Autowired
	private OrderDeleteService orderDeleteService;

	@DeleteMapping("/deleteorder/{id}")
	public void deleteByid(@PathVariable("Id") Integer id) throws Exception {
		orderDeleteService.deleteById(id);

	}

}

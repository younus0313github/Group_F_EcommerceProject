package com.ecommerce.controller;
/*
 * Task No.86
 * Design the Restful web services to delete reward details from database
 * By - Younus K Shaikh
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*
 * Task No.86
 * Design the Restful web services to delete reward details from database
 * By - Younus K Shaikh
 */
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.repository.DeleteRewardRepository;

@RestController
public class DeleteRewardController {

	@Autowired
	private DeleteRewardRepository deleteRewardRepository;

	@DeleteMapping("/deleteReward/{id}")
	public void deleteByid(@PathVariable("Id") Integer id) throws Exception {
		deleteRewardRepository.deleteById(id);
	}

}

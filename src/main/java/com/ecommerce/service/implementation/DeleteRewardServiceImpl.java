package com.ecommerce.service.implementation;
/*
 * Task No.86
 * Design the Restful web services to delete reward details from database
 * By - Younus K Shaikh
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.DeleteRewardRepository;
import com.ecommerce.service.DeleteRewardService;

@Service
public class DeleteRewardServiceImpl implements DeleteRewardService {

	@Autowired
	private DeleteRewardRepository deleteRewardRepository;

	@Override
	public void deleteById(Integer id) {

	}

}

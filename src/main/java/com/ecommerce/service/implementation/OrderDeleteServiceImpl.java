package com.ecommerce.service.implementation;
/*
 * Task No.83
 * Design the Restful web services to delete the order details into database
 * By - Younus K Shaikh
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.OrderDeleteRepository;
import com.ecommerce.service.OrderDeleteService;

@Service
public class OrderDeleteServiceImpl implements OrderDeleteService {
	
	@Autowired
	private OrderDeleteRepository orderDeleteRepository;

	@Override
	public void deleteById(Integer id) {
		orderDeleteRepository.deleteById(id);

	}

}

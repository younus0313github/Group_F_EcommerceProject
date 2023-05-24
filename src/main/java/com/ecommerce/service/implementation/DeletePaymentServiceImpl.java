package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * Task No.69
 * Design Restful API to delete the payment details for purchasing order from user.
 * By - Younus K Shaikh
 */
import com.ecommerce.repository.DeletePaymentRepository;
import com.ecommerce.service.DeletePaymentService;

@Service
public class DeletePaymentServiceImpl implements DeletePaymentService {

	@Autowired
	private DeletePaymentRepository deletePaymentRepository;

	@Override
	public void deleteById(Integer id) {
		deletePaymentRepository.deleteById(id);

	}

}

package com.ecommerce.service.implementation;

/*
 * Task No.89
 * Design the Restful web services to get the reimbursement 
 * By - Younus K Shaikh
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.GetReimbursement;
import com.ecommerce.repository.GetReimbursementRepository;
import com.ecommerce.service.GetReimbursementService;

@Service
public class GetReimbursementServiceImpl implements GetReimbursementService {

	@Autowired
	private GetReimbursementRepository getReimbursementRepository;

	@Override
	public GetReimbursement getReimbursementById(Integer Id) {
		return getReimbursementRepository.findById(Id).get();
	}

}

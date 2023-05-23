package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.repository.ReimbursementDeleteRepository;
import com.ecommerce.service.ReimbursementDeleteService;

@Service
public class ReimbursementDeleteServiceImpl implements ReimbursementDeleteService{

	@Autowired
	private ReimbursementDeleteRepository reimbursementDeleteRepository;
	
	@Override
	public void deleteById(Integer reimbursementId) {
		reimbursementDeleteRepository.deleteById(reimbursementId);
	
	}
}
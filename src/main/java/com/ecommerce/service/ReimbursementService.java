package com.velocity.service;

import com.velocity.model.Reimbursement;


public interface ReimbursementService {

	public Reimbursement addReimbursementDetails(Reimbursement reimbursement);
	
	public Reimbursement updateReimbursementDetails(Reimbursement reimbursement,Integer id);
	
	public Reimbursement getReimbursementDetails(Integer id);
	

}

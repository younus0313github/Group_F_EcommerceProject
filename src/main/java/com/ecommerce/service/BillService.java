package com.ecommerce.service;

import com.ecommerce.model.Bill;

public interface BillService {
	
	    //Add Bill Details
	
		public Bill addBillDetails(Bill bill);
		
		//Update Bill Details
		
		public Bill updateBillDetails(Bill bill,Integer id);
		
		//get Bill details
		public Bill getBillDetails(Integer id);


}

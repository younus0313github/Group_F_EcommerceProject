package com.ecommerce.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.Bill;
import com.ecommerce.repository.BillRepository;
import com.ecommerce.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;

	// Add Bill Details

	@Override
	public Bill addBillDetails(Bill bill) {
		Bill saveBill = billRepository.save(bill);
		return saveBill;
	}

	// Update Bill Details

	@Override
	public Bill updateBillDetails(Bill bill, Integer id) {
		Optional<Bill> optional = billRepository.findById(id);
		Bill oldBill = optional.get();

		oldBill.setBillCode(bill.getBillCode());
		oldBill.setBillName(bill.getBillName());
		oldBill.setBillCom(bill.getBillCom());
		oldBill.setBillNum(bill.getBillNum());
		oldBill.setMoney(bill.getMoney());

		Bill updateBill = billRepository.save(oldBill);

		return updateBill;
	}

	// Get Bill Details

	@Override
	public Bill getBillDetails(Integer id) {
		Optional<Bill> optional = billRepository.findById(id);
		Bill bill = optional.get();
		return bill;
	}

}

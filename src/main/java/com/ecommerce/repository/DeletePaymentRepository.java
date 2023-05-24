package com.ecommerce.repository;
/*
 * Task No.69
 * Design Restful API to delete the payment details for purchasing order from user.
 * By - Younus K Shaikh
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.ecommerce.model.DeletePayment;

@Service
public interface DeletePaymentRepository extends JpaRepository<DeletePayment, Integer> {

}

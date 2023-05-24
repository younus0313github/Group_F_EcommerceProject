package com.ecommerce.repository;

/*
 * Task No.89
 * Design the Restful web services to get the reimbursement 
 * By - Younus K Shaikh
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.GetReimbursement;

@Repository
public interface GetReimbursementRepository extends JpaRepository<GetReimbursement, Integer> {

}

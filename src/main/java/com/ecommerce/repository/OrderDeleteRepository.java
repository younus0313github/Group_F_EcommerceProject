package com.ecommerce.repository;
/*
 * Task No.83
 * Design the Restful web services to delete the order details into database
 * By - Younus K Shaikh
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.OrderDelete;

@Repository
public interface OrderDeleteRepository extends JpaRepository<OrderDelete, Integer>{
	

}

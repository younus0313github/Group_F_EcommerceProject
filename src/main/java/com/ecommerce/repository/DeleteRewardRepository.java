package com.ecommerce.repository;
/*
 * Task No.86
 * Design the Restful web services to delete reward details from database
 * By - Younus K Shaikh
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.DeleteReward;

@Repository
public interface DeleteRewardRepository extends JpaRepository<DeleteReward, Integer> {

}

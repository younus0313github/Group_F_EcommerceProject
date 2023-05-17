package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddressSave;
/*
 * Task No 70 
 * Design Restful API to add user address into database.
 * By - Shaikh Younus Kalindar
 */
@Repository
public interface UserAddressSaveRepository extends JpaRepository<UserAddressSave, Integer> {

}

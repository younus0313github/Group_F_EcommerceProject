package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddressDelete;
/*Task No 116
 * Design Restful web service which is used 
 * to get category with product details from database
 * By - Shaikh Younus Kalindar
 */
@Repository
public interface UserAddressDeleteRepository extends CrudRepository<UserAddressDelete, Serializable> {

}

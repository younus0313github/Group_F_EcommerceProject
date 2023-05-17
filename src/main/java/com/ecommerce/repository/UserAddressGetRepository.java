package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddressGet;


/*Task No 72
 * Design Restful 
 * API to get user address  from database
 * By - Amit waghmare
 */
@Repository
public interface UserAddressGetRepository extends CrudRepository<UserAddressGet, Serializable> {
	
	public UserAddressGet findById(Integer id);

}

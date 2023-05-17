package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddressUpdate;

/*Task No 71
 * Design Restful web service to update user address
 * By - Vaishali Kadam
 */
@Repository
public interface UserAddressUpdateRepository extends JpaRepository<UserAddressUpdate, Integer> {

}

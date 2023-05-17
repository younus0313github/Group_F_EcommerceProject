package com.ecommerce.service;

import com.ecommerce.model.UserAddressUpdate;

/*Task No 71
 * Design Restful web service to update user address
 * By - Vaishali Kadam
 */
public interface UserAddressUpdateService {
	
	public UserAddressUpdate updateUserAddress(UserAddressUpdate userAddress, Integer pid);

}

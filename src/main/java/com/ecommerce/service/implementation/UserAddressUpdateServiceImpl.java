package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddressUpdate;
import com.ecommerce.repository.UserAddressUpdateRepository;
import com.ecommerce.service.UserAddressUpdateService;

/*Task No 71
 * Design Restful web service to update user address
 * By - Vaishali Kadam
 */
@Service
public class UserAddressUpdateServiceImpl implements UserAddressUpdateService {

	// inject repository reference
	@Autowired
	private UserAddressUpdateRepository userAddressRepository;

	@Override
	public UserAddressUpdate updateUserAddress(UserAddressUpdate userAddress, Integer id) {

		if (userAddressRepository.findById(id).isPresent()) {
			UserAddressUpdate userAdd = userAddressRepository.getById(id);
			userAdd.setUserAddress(userAddress.getUserAddress());
			userAdd.setUserId(userAddress.getUserId());
			userAdd.setConsignee(userAddress.getConsignee());
			userAdd.setPhoneNum(userAddress.getPhoneNum());
			userAdd.setIsDefault(userAddress.getIsDefault());

			UserAddressUpdate updatedAdd = userAddressRepository.save(userAdd);
			return updatedAdd;
		} else {
			return null;
		}
	}

}

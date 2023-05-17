package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserAddressUpdate;
import com.ecommerce.service.UserAddressUpdateService;

/*Task No 71
 * Design Restful web service to update user address
 * By - Vaishali Kadam
 */

@RestController
@RequestMapping(path = "/useraddress")
public class UserAddressUpdateController {

	// Inject the service here
	@Autowired
	private UserAddressUpdateService userAddressService;

	// Design the Restful web service to update user address

	@PutMapping("/update/{id}")
	public ResponseEntity<UserAddressUpdate> updateAddress(@RequestBody UserAddressUpdate userAddress,
			@PathVariable("id") Integer id) {
		UserAddressUpdate userAdds = userAddressService.updateUserAddress(userAddress, id);
		return ResponseEntity.ok().body(userAdds);
	}
}


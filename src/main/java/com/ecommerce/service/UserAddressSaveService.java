package com.ecommerce.service;
/*
 * Task No 70 
 * Design Restful API to add user address into database.
 * By - Shaikh Younus Kalindar
 */
import com.ecommerce.model.UserAddressSave;

public interface UserAddressSaveService {

	public UserAddressSave saveUserAddress(UserAddressSave useraddress);
}

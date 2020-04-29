package com.satya.flashsale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.flashsale.bean.RegUserDetails;
import com.satya.flashsale.entity.FlashSaleRegUser;
import com.satya.flashsale.repository.FSRegUserRepository;
@Service
public class FSRegUserService {
	@Autowired
	private FSRegUserRepository fsRegUserRepository;
	public boolean registerUser(RegUserDetails userDetails) {
		//get flash sale details
		
		FlashSaleRegUser flashSaleRegUser = new FlashSaleRegUser(userDetails);
		flashSaleRegUser = fsRegUserRepository.save(flashSaleRegUser);
		return true;
	}
}
/*
 * Users are required to register for this flash sale 
 * even before hand to purchase the products or browse through the flash sale page.
 * 
 * Example:n flash sale user registratin service will do
 * user registration before 29th april 2020 if they are trying to register on or after 29th april 2020 stop them.
*/

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
		FlashSaleRegUser flashSaleRegUser = new FlashSaleRegUser(userDetails);
		flashSaleRegUser = fsRegUserRepository.save(flashSaleRegUser);
		return true;
	}
}

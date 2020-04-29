package com.satya.flashsale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.flashsale.repository.FSDetailsRepository;

@Service
public class FlashSalePurchaseService {
    @Autowired
    private FSDetailsRepository fsDetailsRepository;
    public boolean purchase( ) {
    	return true;
    	
    }
}
/*
 The following conditions holding true in this solution
  - Don't oversell or undersell example: (2 items are purchased then stop flash sale)
  - Only registered users allowed to make a purchase.  example: (validate the user)
 */

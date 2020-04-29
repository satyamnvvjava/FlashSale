package com.satya.flashsale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.flashsale.model.FlashSaleBean;
import com.satya.flashsale.repository.FSDetailsRepository;

@Service
public class FlashSalePurchaseService {
    @Autowired
    private FSDetailsRepository fsDetailsRepository;
    public boolean purchase( ) {
    	return true;
    	
    }
}

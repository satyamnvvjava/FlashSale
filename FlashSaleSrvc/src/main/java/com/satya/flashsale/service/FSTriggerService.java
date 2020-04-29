package com.satya.flashsale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.satya.flashsale.entity.FlashSaleDetails;
import com.satya.flashsale.entity.ItemDetails;
import com.satya.flashsale.model.FlashSaleTriggerBean;
import com.satya.flashsale.repository.FSDetailsRepository;
import com.satya.flashsale.repository.FSItemRepository;

@Service
public class FSTriggerService {
	@Autowired
	private FSItemRepository itemRepository;
	@Autowired
	private FSDetailsRepository fsDetailsRepository;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired 
	private Environment env;
	public boolean trigger(FlashSaleTriggerBean flashSaleTriggerBean) {

		ItemDetails itemDetails = itemRepository.findByItemId(flashSaleTriggerBean.getItemId());
		FlashSaleDetails flashSaleDetails = new FlashSaleDetails(flashSaleTriggerBean);
		flashSaleDetails.setItemDetails(itemDetails);
		flashSaleDetails = fsDetailsRepository.save(flashSaleDetails);
		// make rest call using rest template
		//restTemplate.post
		String emailSrvcEndPoint = env.getProperty("emailsrvcendpoint");
		return true;
	}
}

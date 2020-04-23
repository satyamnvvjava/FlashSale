package com.satya.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.flashsale.model.FlashSaleTriggerBean;
import com.satya.flashsale.service.FSTriggerService;

@RestController
public class FSTriggerController {
	@Autowired
	private FSTriggerService fsTriggerService;
	@PostMapping
    public String triggerFlashSale(@RequestBody FlashSaleTriggerBean flashSaleTriggerBean) {
		
		if(fsTriggerService.trigger(flashSaleTriggerBean))
			return "flashSale triggered successfully!!";
			else
				return "flashSale triggered faild!!";
		
    }
}

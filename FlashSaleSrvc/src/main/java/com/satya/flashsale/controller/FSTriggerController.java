package com.satya.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.flashsale.bean.FlashSaleTriggerBean;
import com.satya.flashsale.service.FSTriggerService;

@RestController
public class FSTriggerController {
	@Autowired
	private FSTriggerService fsTriggerService;

	@PostMapping("/triggerflashsale")
	public ResponseEntity<?> triggerFlashSale(@RequestBody FlashSaleTriggerBean flashSaleTriggerBean) {

		if (fsTriggerService.trigger(flashSaleTriggerBean))
			return ResponseEntity.ok("flashSale triggered successfully!!");
		else
			return new ResponseEntity<>("flashSale triggered faild!!", HttpStatus.INTERNAL_SERVER_ERROR);

	}
}

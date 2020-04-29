package com.satya.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.flashsale.service.FlashSalePurchaseService;

@RestController
public class FlashSalePurchaseController {
	@Autowired
	private FlashSalePurchaseService flashSalePurchaseService;

	@PostMapping("/purchase")
	public ResponseEntity<?> purchase() {
		return ResponseEntity.ok("");
	}
}

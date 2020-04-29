package com.satya.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.flashsale.bean.RegUserDetails;
import com.satya.flashsale.service.FSRegUserService;

@RestController
public class FSRegUserController {
	@Autowired
	private FSRegUserService fsRegUserService;

	@PostMapping("/registerUser")
	public ResponseEntity<?> resiterUser(@RequestBody RegUserDetails userDetails) {
		if (fsRegUserService.registerUser(userDetails))
			return ResponseEntity.ok("regisration success!!");
		else
			return  new ResponseEntity<>("regisration faild!!", HttpStatus.INTERNAL_SERVER_ERROR);

	}
}

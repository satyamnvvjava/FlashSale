package com.satya.flashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
   public String resiterUser(@RequestBody RegUserDetails userDetails) {
	   if(fsRegUserService.registerUser(userDetails))
	    return "regisration success!!";
	   else
		   return "regisration faild!!";
   }
}

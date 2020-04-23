package com.satya.fsemailsrvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.fsemailsrvc.bean.FlashSaleBean;
import com.satya.fsemailsrvc.service.EmailService;
import com.satya.fsemailsrvc.service.UserService;

@RestController
public class EmailController {
  @Autowired
  private EmailService emailService;
  @Autowired
  private UserService userService;
  
  @PostMapping("/sendFSEmails")
  public String sendFSEmails(@RequestBody FlashSaleBean flashSaleBean) {
	  emailService.sendEmails(userService.getAllUserEmails(),flashSaleBean);
	  
	  return "emails sent successfully";
  }
}

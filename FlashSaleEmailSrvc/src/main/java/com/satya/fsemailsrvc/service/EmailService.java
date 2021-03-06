package com.satya.fsemailsrvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.satya.fsemailsrvc.bean.FlashSaleBean;

/*
 * EmailService will connect to company user base(user_details data base)
 * and sends an email.
 * The email should contain:
 * 1. flash sale details and, REST URL for registration, REST URL for flash sale purchase
 */
@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmails(List<String> emailsList,FlashSaleBean flashSaleBean) {
		
		
		String sendersList[] = new String[emailsList.size()];
		
		SimpleMailMessage msg = new SimpleMailMessage();
		emailsList.toArray(sendersList);
		msg.setTo(sendersList);
		msg.setSubject("Hurry UP!! flashSale"+flashSaleBean.getFsName());
		String s = "flashSale Details:"+flashSaleBean+toString();
		msg.setText(s+"http://fs_srvc:8081/register_user"+","+"http://fs_srvc:8081/purchase");
		
		javaMailSender.send(msg);
	}
}

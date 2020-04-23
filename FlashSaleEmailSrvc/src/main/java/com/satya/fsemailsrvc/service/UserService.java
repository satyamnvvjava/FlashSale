package com.satya.fsemailsrvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.fsemailsrvc.entity.User;
import com.satya.fsemailsrvc.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public List<String> getAllUserEmails(){
		List<User> users = userRepository.findAll();
		List<String> emails=new ArrayList<String>();
		for(User user:users) {
			emails.add(user.getEmailaddress());
		}
		return emails;
	}
}

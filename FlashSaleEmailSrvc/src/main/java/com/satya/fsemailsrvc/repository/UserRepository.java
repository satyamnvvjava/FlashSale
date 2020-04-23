package com.satya.fsemailsrvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.fsemailsrvc.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer>{
	 public abstract List<User> findAll();
	 public abstract User findById(int id);
	 
}

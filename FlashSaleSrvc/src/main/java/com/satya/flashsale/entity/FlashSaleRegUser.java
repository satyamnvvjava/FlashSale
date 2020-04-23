package com.satya.flashsale.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.satya.flashsale.bean.RegUserDetails;

@Entity
@Table(name = "FS_REGISTERED_USER")
public class FlashSaleRegUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reg_user_id")
    private int reg_user_id;  
	@Column(name = "reg_user_name")
	private String regUserName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id", referencedColumnName = "add_id")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fs_id", referencedColumnName = "fs_id")
	private FlashSaleDetails flashSaleDetails;
	public FlashSaleRegUser(){
		
	}
	public FlashSaleRegUser(RegUserDetails regUserDetails) {
		regUserName = regUserDetails.getUserName();
		address = new Address();
		address.setLine1(regUserDetails.getDeliveryAddress().getLine1());
		address.setLine2(regUserDetails.getDeliveryAddress().getLine2());
		flashSaleDetails.setFsId(regUserDetails.getFlashSaleId());
	}
	public int getReg_user_id() {
		return reg_user_id;
	}
	public void setReg_user_id(int reg_user_id) {
		this.reg_user_id = reg_user_id;
	}
	public String getRegUserName() {
		return regUserName;
	}
	public void setRegUserName(String regUserName) {
		this.regUserName = regUserName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public FlashSaleDetails getFlashSaleDetails() {
		return flashSaleDetails;
	}
	public void setFlashSaleDetails(FlashSaleDetails flashSaleDetails) {
		this.flashSaleDetails = flashSaleDetails;
	}
	
}

package com.satya.flashsale.bean;

public class RegUserDetails {
	private String userName;
	private int flashSaleId;
	private DeliveryAddress deliveryAddress;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(int flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

}

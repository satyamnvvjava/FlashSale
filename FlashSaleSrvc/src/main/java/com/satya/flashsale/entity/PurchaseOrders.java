package com.satya.flashsale.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fs_purchase_orders")
public class PurchaseOrders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "purchase_order_date")
	private Date purchseOrderDate;
	@Column(name = "order_count")
	private int orderCount;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fs_id", referencedColumnName = "fs_id")
	private FlashSaleDetails flashSaleDetails;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reg_user_id", referencedColumnName = "reg_user_id")
	private FlashSaleRegUser flashSaleRegUser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPurchseOrderDate() {
		return purchseOrderDate;
	}
	public void setPurchseOrderDate(Date purchseOrderDate) {
		this.purchseOrderDate = purchseOrderDate;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public FlashSaleDetails getFlashSaleDetails() {
		return flashSaleDetails;
	}
	public void setFlashSaleDetails(FlashSaleDetails flashSaleDetails) {
		this.flashSaleDetails = flashSaleDetails;
	}
	public FlashSaleRegUser getFlashSaleRegUser() {
		return flashSaleRegUser;
	}
	public void setFlashSaleRegUser(FlashSaleRegUser flashSaleRegUser) {
		this.flashSaleRegUser = flashSaleRegUser;
	}
	
}

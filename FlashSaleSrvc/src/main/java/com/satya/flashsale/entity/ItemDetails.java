package com.satya.flashsale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "item_deatils")
public class ItemDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private int itemId;
	@Column(name = "item_name")
    private String itemName;
	@Column(name = "item_quantity") 
    private int itemQuantity;
	@Column(name = "item_price_unit")
    private int itemPriceUnit;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemPriceUnit() {
		return itemPriceUnit;
	}
	public void setItemPriceUnit(int itemPriceUnit) {
		this.itemPriceUnit = itemPriceUnit;
	}
	
}

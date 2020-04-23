package com.satya.fsemailsrvc.bean;

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


public class FlashSaleBean {
	
	private int fsId;
    private String fsName;
    private Date fsDateStarts;
    private Date fsDateEnds;
    private int fsItemCount;
    private int fsOfferPrice;
    private String itemName;
    private int itemActualPrice;
    
    

	public int getItemActualPrice() {
		return itemActualPrice;
	}

	public void setItemActualPrice(int itemActualPrice) {
		this.itemActualPrice = itemActualPrice;
	}

	@Override
	public String toString() {
		return "FlashSaleBean [fsId=" + fsId + ", fsName=" + fsName + ", fsDateStarts=" + fsDateStarts + ", fsDateEnds="
				+ fsDateEnds + ", fsItemCount=" + fsItemCount + ", fsOfferPrice=" + fsOfferPrice + ", itemName="
				+ itemName + ", itemActualPrice=" + itemActualPrice + "]";
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getFsId() {
		return fsId;
	}

	public void setFsId(int fsId) {
		this.fsId = fsId;
	}

	public String getFsName() {
		return fsName;
	}

	public void setFsName(String fsName) {
		this.fsName = fsName;
	}

	public Date getFsDateStarts() {
		return fsDateStarts;
	}

	public void setFsDateStarts(Date fsDateStarts) {
		this.fsDateStarts = fsDateStarts;
	}

	public Date getFsDateEnds() {
		return fsDateEnds;
	}

	public void setFsDateEnds(Date fsDateEnds) {
		this.fsDateEnds = fsDateEnds;
	}

	public int getFsItemCount() {
		return fsItemCount;
	}

	public void setFsItemCount(int fsItemCount) {
		this.fsItemCount = fsItemCount;
	}

	public int getFsOfferPrice() {
		return fsOfferPrice;
	}

	public void setFsOfferPrice(int fsOfferPrice) {
		this.fsOfferPrice = fsOfferPrice;
	} 
}

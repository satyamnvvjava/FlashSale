package com.satya.flashsale.bean;

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


public class FlashSaleTriggerBean {
    private String fsName;
    private Date fsDateStarts;
    private Date fsDateEnds;
    private int fsItemCount;
    private int fsOfferPrice;
    private int itemId;
      

	

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

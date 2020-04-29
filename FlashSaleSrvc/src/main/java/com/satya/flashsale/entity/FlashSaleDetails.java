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

import com.satya.flashsale.bean.FlashSaleTriggerBean;

@Entity
@Table(name = "flash_sale_details")
public class FlashSaleDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fs_id")
	private int fsId;
	@Column(name = "fs_name")
    private String fsName;
    @Column(name = "fs_date_starts")
    private Date fsDateStarts;
    @Column(name = "fs_date_ends")
    private Date fsDateEnds;
    
    @Column(name = "fs_item_count")
    private int fsItemCount;
    @Column(name="fs_offer_price")
    private int fsOfferPrice;
    
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id", referencedColumnName = "item_id")
    private ItemDetails itemDetails;
    
    public FlashSaleDetails() {
    	
    }
    public FlashSaleDetails(FlashSaleTriggerBean bean) {
    	fsName = bean.getFsName();
    	fsDateStarts = bean.getFsDateStarts();
    	fsDateEnds = bean.getFsDateEnds();
    	fsItemCount = bean.getFsItemCount();
    	fsOfferPrice = bean.getFsOfferPrice();
    	
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

	public ItemDetails getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}
    
   
    
}

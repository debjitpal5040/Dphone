package com.debjit.pal.Dphone.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class Details {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;

	@Column(name="userId")
	private int userId;
	
	@Column(name="referralId")
	private int referralId;

	@Column(name="purchaseDate")
	private Date purchaseDate;

	@Column(name="productName")
	private String productName;

	public Details(){
		
	}

	public Details(int userId, int referralId, Date purchaseDate, String productName) {
		super();
		this.userId = userId;
		this.referralId = referralId;
		this.purchaseDate = purchaseDate;
		this.productName = productName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReferralId() {
		return referralId;
	}

	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
}

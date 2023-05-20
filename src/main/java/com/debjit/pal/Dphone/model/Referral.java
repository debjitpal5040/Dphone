package com.debjit.pal.Dphone.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="referral")
public class Referral {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int referralId;

	@Column(name="referralFirstName")
	private String referralFirstName;

	@Column(name="referralLastName")
	private String referralLastName;

	@Column(name="mobile")
	private long mobile;

	@Column(name="email")
	private String email;

	@Column(name="userId")
	private int userId;

	@Column(name="referralDate")
	private Date referralDate;

	@Column(name="status")
	private int status;

	public Referral(){

	}

	public Referral(String referralFirstName, String referralLastName, long mobile, String email, int userId,
			Date referralDate, int status) {
		super();
		this.referralFirstName = referralFirstName;
		this.referralLastName = referralLastName;
		this.mobile = mobile;
		this.email = email;
		this.userId = userId;
		this.referralDate = referralDate;
		this.status = status;
	}

	public int getReferralId() {
		return referralId;
	}

	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}

	public String getReferralFirstName() {
		return referralFirstName;
	}

	public void setReferralFirstName(String referralFirstName) {
		this.referralFirstName = referralFirstName;
	}

	public String getReferralLastName() {
		return referralLastName;
	}

	public void setReferralLastName(String referralLastName) {
		this.referralLastName = referralLastName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getReferralDate() {
		return referralDate;
	}

	public void setReferralDate(Date referralDate) {
		this.referralDate = referralDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}

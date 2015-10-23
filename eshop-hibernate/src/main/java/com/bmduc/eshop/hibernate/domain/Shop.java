/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:46:52 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:46:52 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_SHOP")
public class Shop {
	private long id;
	private String name;
	private User user;
	private boolean status;
	private PostingPackage postingPackage;
	private Date registerdDate;
	private Date dateOfBoughtPackage;
	private String phoneNumber;
	private String address;
	private String email;
	private ProvinceCode provinceCode;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SHOP_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "SHOP_NAME")
	public String getName() {
		return name;
	}
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	@Column(name = "USER_STATUS")
	public boolean isStatus() {
		return status;
	}
	
	@ManyToOne
	@JoinColumn(name = "POSTING_PACKAGE_ID")
	public PostingPackage getPostingPackage() {
		return postingPackage;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SHOP_REGISTERD_DATE")
	public Date getRegisterdDate() {
		return registerdDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SHOP_BOUGHT_PACKAGE")
	public Date getDateOfBoughtPackage() {
		return dateOfBoughtPackage;
	}
	
	@Column(name = "SHOP_PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Column(name = "SHOP_ADDRESS")
	public String getAddress() {
		return address;
	}
	
	@Column(name = "SHOP_EMAIL")
	public String getEmail() {
		return email;
	}
	
	@ManyToOne
	@JoinColumn(name = "PROVINCE_CODE_ID")
	public ProvinceCode getProvinceCode() {
		return provinceCode;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setPostingPackage(PostingPackage postingPackage) {
		this.postingPackage = postingPackage;
	}
	
	public void setRegisterdDate(Date registerdDate) {
		this.registerdDate = registerdDate;
	}
	
	public void setDateOfBoughtPackage(Date dateOfBoughtPackage) {
		this.dateOfBoughtPackage = dateOfBoughtPackage;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setProvinceCode(ProvinceCode provinceCode) {
		this.provinceCode = provinceCode;
	}
}

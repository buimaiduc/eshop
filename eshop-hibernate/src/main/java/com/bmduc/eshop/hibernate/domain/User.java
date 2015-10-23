/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 8:03:13 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ####################################################<br/>
 * Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 8:03:13 PM<br/>
 * 
 * @author ducb<br/>
 */

@Entity
@Table(name = "ES_USER")
public class User {
	private long id;
	private String username;
	private String password;
	private String fullName;
	private String address;
	private Gender gender;
	private Date birthOfDate;
	private String phoneNumber;
	private Date joinedDate;
	private String email;
	private String logo;
	private boolean status;
	private ProvinceCode provinceCode;
	private UserType userType;

	@Id
	@Column(name = "USER_ID")
	public long getId() {
		return id;
	}

	@Column(name = "USER_USERNAME", nullable = false, unique = true)
	public String getUsername() {
		return username;
	}

	@Column(name = "USER_PASSWORD", nullable = false)
	public String getPassword() {
		return password;
	}

	@Column(name = "USER_FULLNAME")
	public String getFullName() {
		return fullName;
	}

	@Column(name = "USER_ADDRESS")
	public String getAddress() {
		return address;
	}

	@Column(name = "USER_GENDER")
	@Enumerated(value = EnumType.STRING)
	public Gender getGender() {
		return gender;
	}

	@Column(name = "USER_BIRTH_OF_DATE")
	@Temporal(TemporalType.TIME)
	public Date getBirthOfDate() {
		return birthOfDate;
	}

	@Column(name = "USER_PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Column(name = "USER_JOINED_DATE")
	@Temporal(TemporalType.TIME)
	public Date getJoinedDate() {
		return joinedDate;
	}

	@Column(name = "USER_EMAIL")
	public String getEmail() {
		return email;
	}

	@Column(name = "USER_LOGO")
	public String getLogo() {
		return logo;
	}

	@Column(name = "USER_STATUS_ID")
	public boolean getStatus() {
		return status;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROVINCE_CODE_ID")
	public ProvinceCode getProvinceCode() {
		return provinceCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "")
	public UserType getUserType() {
		return userType;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setProvinceCode(ProvinceCode provinceCode) {
		this.provinceCode = provinceCode;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}

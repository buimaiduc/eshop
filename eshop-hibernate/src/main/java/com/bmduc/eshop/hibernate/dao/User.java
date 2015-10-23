/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name="CUSTOMER")
public class User {
	@Id
	@Column(name="CUSTOMER_ID")
	@GeneratedValue
	private Long id;
	
	@Column(name="CUSTOMER_USERNAME")
	private String username;
	
	@Column(name="CUSTOMER_PASSWORD")
	private String password;
	
	@Column(name="CUSTOMER_FULLNAME")
	private String fullName;
	
	@Column(name="CUSTOMER_ADDRESS")
	private String address;
	
	@Column(name="CUSTOMER_GENDER")
	private Gender gender;
	
	@Column(name="CUSTOMER_DATEOFBIRTH")
	private Date dateOfBirth;
	
	@Column(name="CUSTOMER_PHONE")
	private String phone;
	
	@Column(name="CUSTOMER_JOINEDDATE")
	private Date joinedDate;
	
	@Column(name="CUSTOMER_EMAIL")
	private String email;
	
	@Column(name="CUSTOMER_LOG")
	private String logo;
	
	@Column(name="CUSTOMER_STATUS")
	private UserStatus status;
	
	@Column(name="CUSTOMER_PROVICECODE")
	private ProvinceCode provinceCode;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	/**
	 * @return the dateOfBirth
	 */
	public Date dateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * @param birthday the dateOfBirth to set
	 */
	public void setBirthday(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the joinedDate
	 */
	public Date getJoinedDate() {
		return joinedDate;
	}
	
	/**
	 * @param joinedDate the joinedDate to set
	 */
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}
	
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	/**
	 * @return the status
	 */
	public UserStatus getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	/**
	 * @return the provinceCode
	 */
	public ProvinceCode getProvinceCode() {
		return provinceCode;
	}
	
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(ProvinceCode provinceCode) {
		this.provinceCode = provinceCode;
	}
}

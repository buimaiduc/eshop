/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:37:57 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:37:57 PM<br/>
 * 
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_POSTER")
public class Poster {
	private long id;
	private User user;
	private String companyName;
	private String department;
	private String fax;
	private String website;
	private float money;

	@Id
	@Column(name = "POSTER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}

	@Column(name = "POSTER_COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}

	@Column(name = "POSTER_DEPARTMENT")
	public String getDepartment() {
		return department;
	}

	@Column(name = "POSTER_FAX")
	public String getFax() {
		return fax;
	}

	@Column(name = "POSTER_WEBSITE")
	public String getWebsite() {
		return website;
	}

	@Column(name = "POSTER_MONEY")
	public float getMoney() {
		return money;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setMoney(float money) {
		this.money = money;
	}

}

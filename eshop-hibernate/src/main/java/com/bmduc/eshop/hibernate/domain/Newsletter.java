/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:50:27 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:50:27 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_NEWSLETTER")
public class Newsletter {
	private long id;
	private String email;
	private Date regiteredDate;
	
	@Id
	@GeneratedValue
	@Column(name = "NEWSLETTER_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "NEWSLETTER_EMAIL")
	public String getEmail() {
		return email;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEWSLETTER_REGISTERD_DATE")
	public Date getRegiteredDate() {
		return regiteredDate;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRegiteredDate(Date regiteredDate) {
		this.regiteredDate = regiteredDate;
	}
}

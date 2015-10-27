/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 26, 2015<br/>
 * Creation Time: 11:35:42 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 26, 2015<br/>
 * Creation Time: 11:35:42 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_PAYMENT")
public class Payment {
	private long id;
	private String name;
	private boolean active;
	
	@Id
	@GeneratedValue
	@Column(name = "PAYMENT_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "PAYMENT_NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "PAYMENT_ACTIVE")
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:23:33 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:23:33 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_PRODUCT")
public class Product {
	private long id;
	private String name;
	private boolean actvive;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "PRODUCT_NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "PRODUCT_ACTIVE")
	public boolean isActvive() {
		return actvive;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setActvive(boolean actvive) {
		this.actvive = actvive;
	}
}

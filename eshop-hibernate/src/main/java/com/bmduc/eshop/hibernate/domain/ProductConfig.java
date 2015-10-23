/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:26:35 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:26:35 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "PRODUCT_CONFIG")
public class ProductConfig {
	private long id;
	private String name;
	private boolean multiRows;
	private ThirdType thirdType;
	private boolean active;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_CONFIG_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "PRODUCT_CONFIG_NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "PROUCT_CONFIG_MULTI_ROWS")
	public boolean isMultiRows() {
		return multiRows;
	}
	
	@ManyToOne
	@JoinColumn(name = "THIRD_TYPE_ID")
	public ThirdType getThirdType() {
		return thirdType;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMultiRows(boolean multiRows) {
		this.multiRows = multiRows;
	}
	
	public void setThirdType(ThirdType thirdType) {
		this.thirdType = thirdType;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

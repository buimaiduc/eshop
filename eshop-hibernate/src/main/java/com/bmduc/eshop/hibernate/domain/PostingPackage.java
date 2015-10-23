/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 10:00:14 PM<br/>
 * @author ducb<br/>
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
 * Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 10:00:14 PM<br/>
 * 
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_POSTING_PACKAGE")
public class PostingPackage {
	private long id;
	private String name;
	private int time;
	private float price;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	@Column(name = "POSTING_PACKAGE_NAME", unique = true)
	public String getName() {
		return name;
	}

	@Column(name = "POSTING_PACKAGE_TIME")
	public int getTime() {
		return time;
	}

	@Column(name = "POSTING_PACKAGE_PRICE")
	public float getPrice() {
		return price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

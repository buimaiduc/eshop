/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 8:11:31 PM<br/>
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
 * Creation Time: 8:11:31 PM<br/>
 * 
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_PROVINCECODE")
public class ProvinceCode {
	private long id;
	private String name;

	@Id
	@Column(name = "PROVINCE_CODE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	@Column(name = "PROVINCECODE_NAME", unique = true)
	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

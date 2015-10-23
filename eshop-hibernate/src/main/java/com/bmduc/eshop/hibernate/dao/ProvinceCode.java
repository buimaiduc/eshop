/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.dao;

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
@Table(name="PROVINCE_CODE")
public class ProvinceCode {
	@Id
	@Column(name="PROVINCE_CODE_ID")
	@GeneratedValue
	private Long id;
	
	@Column(name="PROVINCE_CODE_NAME")
	private String name;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}

/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 7:09:38 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
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
 * Creation Time: 7:09:38 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_SECOND_TYPE")
public class SecondType {
	private long id;
	private String name;
	private FirstType firstType;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SECOND_TYPE_iD")
	public long getId() {
		return id;
	}
	
	@Column(name = "SECOND_TYPE_NAME")
	public String getName() {
		return name;
	}
	
	@ManyToOne
	@JoinColumn(name = "FIRST_TYPE_ID")
	public FirstType getFirstType() {
		return firstType;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstType(FirstType firstType) {
		this.firstType = firstType;
	}
}

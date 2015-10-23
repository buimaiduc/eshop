/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 7:11:37 PM<br/>
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
 * Creation Time: 7:11:37 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_THIRD_TYPE")
public class ThirdType {
	private long id;
	private String name;
	private SecondType secondType;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "THIRD_TYPE_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "THIRD_TYPE_NAME")
	public String getName() {
		return name;
	}
	
	@ManyToOne
	@JoinColumn(name = "SECOND_TYPE_ID")
	public SecondType getSecondType() {
		return secondType;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSecondType(SecondType secondType) {
		this.secondType = secondType;
	}
}

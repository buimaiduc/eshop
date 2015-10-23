/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:05:25 PM<br/>
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
 * Creation Time: 6:05:25 PM<br/>
 * @author DucBui<br/>
 */

@Entity
@Table(name = "ES_UI")
public class UI {
	private long id;
	private String name;
	private String path;
	private boolean active;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UI_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "UI_NAME")
	public String getName() {
		return name;
	}
	
	@Column(name = "UI_PATH")
	public String getPath() {
		return path;
	}
	
	@Column(name = "UI_ACTIVE")
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

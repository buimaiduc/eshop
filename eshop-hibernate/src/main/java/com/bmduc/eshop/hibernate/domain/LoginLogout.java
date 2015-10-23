/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 7:22:12 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 7:22:12 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_LOGIN_LOGOUT")
public class LoginLogout {
	private long id;
	private User user;
	private Date loginDate;
	private Date logoutDate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOGIN_LOGOUT_ID")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGIN_LOGOUT_LOGIN_DATE")
	public Date getLoginDate() {
		return loginDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGIN_LOGOUT_LOGOUT_DATE")
	public Date getLogoutDate() {
		return logoutDate;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}
}

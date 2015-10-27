/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:38:45 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:38:45 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_QUESTION")
public class Question {
	private long id;
	private String subject;
	private String body;
	private Date postedDate;
	private Date updatedDate;
	private FirstType firstType;
	private User user;
	private int watchedQuantity;
	private boolean active;
	
	@Id
	@GeneratedValue
	@Column(name = "QUESTION_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "QUESTION_SUBJECT")
	public String getSubject() {
		return subject;
	}
	
	@Column(name = "QUESTION_BODY")
	public String getBody() {
		return body;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUESTION_POSTED_DATE")
	public Date getPostedDate() {
		return postedDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUESTION_UPDATED_DATE")
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	@ManyToOne
	@JoinColumn(name = "FIRST_TYPE_ID")
	public FirstType getFirstType() {
		return firstType;
	}
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	@Column(name = "QUESTION_WATCHED_QUANTITY")
	public int getWatchedQuantity() {
		return watchedQuantity;
	}
	
	@Column(name = "QUESTION_ACTIVE")
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void setFirstType(FirstType firstType) {
		this.firstType = firstType;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setWatchedQuantity(int watchedQuantity) {
		this.watchedQuantity = watchedQuantity;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

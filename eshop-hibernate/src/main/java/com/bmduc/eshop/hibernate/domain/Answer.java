/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:43:59 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:43:59 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_ANSWER")
public class Answer {
	private long id;
	private String content;
	private Date postedDate;
	private Date updatedDate;
	private Question question;
	private User user;
	
	@Id
	@GeneratedValue
	@Column(name = "ANSWER_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "ANSWER_CONTENT")
	public String getContent() {
		return content;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ANSWER_POSTED_DATE")
	public Date getPostedDate() {
		return postedDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ANSWER_UPDATED_DATE")
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	@ManyToOne
	@JoinColumn(name = "QUESTION_ID")
	public Question getQuestion() {
		return question;
	}
	
	@ManyToMany
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}

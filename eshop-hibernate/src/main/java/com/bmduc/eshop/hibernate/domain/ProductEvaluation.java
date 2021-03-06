/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 24, 2015<br/>
 * Creation Time: 8:45:03 AM<br/>
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
 * Creation date: Oct 24, 2015<br/>
 * Creation Time: 8:45:03 AM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_PRODUCT_EVALUATION")
public class ProductEvaluation {
	private long id;
	private String subject;
	private int marks;
	private String pros;
	private String cons;
	private String general;
	private User user;
	private Product product;
	private Date postedDate;
	private boolean active;
	
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_EVALUATION_ID")
	public long getId() {
		return id;
	}
	
	@Column(name = "PRODUCT_EVALUATION_SUBJECT")
	public String getSubject() {
		return subject;
	}
	
	@Column(name = "PRODUCT_EVALUATION_SUBJECT")
	public int getMarks() {
		return marks;
	}
	
	@Column(name = "PRODUCT_EVALUATION_PROS")
	public String getPros() {
		return pros;
	}
	
	@Column(name = "PRODUCT_EVALUATION_CONS")
	public String getCons() {
		return cons;
	}
	
	@Column(name = "PRODUCT_EVALUATION_GENERAL")
	public String getGeneral() {
		return general;
	}
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	public Product getProduct() {
		return product;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRODUCT_EVALUATION_POSTED_DATE")
	public Date getPostedDate() {
		return postedDate;
	}
	
	@Column(name = "PRODUCT_EVALUATION_ACTIVE")
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void setPros(String pros) {
		this.pros = pros;
	}
	
	public void setCons(String cons) {
		this.cons = cons;
	}
	
	public void setGeneral(String general) {
		this.general = general;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

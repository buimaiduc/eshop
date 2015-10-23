/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 7:27:31 PM<br/>
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
 * Creation Time: 7:27:31 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_PRODUCT_REVIEW")
public class ProductReview {
	private long id;
	private User user;
	private Product product;
	private Date date;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_REVIEW_ID")
	public long getId() {
		return id;
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
	@Column(name = "PRODUCT_REVIEW_DATE")
	public Date getDate() {
		return date;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}

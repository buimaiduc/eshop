/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 26, 2015<br/>
 * Creation Time: 11:31:20 PM<br/>
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 26, 2015<br/>
 * Creation Time: 11:31:20 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_RECEIPT")
public class Receipt {
	private long id;
	private User user;
	private Date bookedDate;
	private Date neededDate;
	private Date DeliveredDate;
	private String fullName;
	private String address;
	private String email;
	private String phoneNumber;
	private String note;
	private Status status;
	private Transport transport;
	private Payment payment;
	private Shop shop;
	
	@Id
	@GeneratedValue
	@Column(name = "RECEIPT_ID")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return user;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECEIPT_BOOKED_DATE")
	public Date getBookedDate() {
		return bookedDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECEIPT_NEEDED_DATE")
	public Date getNeededDate() {
		return neededDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECEIPT_DELIVERED_DATE")
	public Date getDeliveredDate() {
		return DeliveredDate;
	}
	
	@Column(name = "RECEIPT_FULL_NAME")
	public String getFullName() {
		return fullName;
	}
	
	@Column(name = "RECEIPT_ADDRESS")
	public String getAddress() {
		return address;
	}
	
	@Column(name = "RECEIPT_EMAIL")
	public String getEmail() {
		return email;
	}
	
	@Column(name = "RECEIPT_PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Column(name = "RECEIPT_NOTE")
	public String getNote() {
		return note;
	}
	
	@Column(name = "RECEIPT_STATUS")
	public Status getStatus() {
		return status;
	}
	
	@OneToOne
	@JoinColumn(name = "TRANSPORT_ID")
	public Transport getTransport() {
		return transport;
	}
	
	@OneToOne
	@JoinColumn(name = "PAYMENT_ID")
	public Payment getPayment() {
		return payment;
	}
	
	public Shop getShop() {
		return shop;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	public void setNeededDate(Date neededDate) {
		this.neededDate = neededDate;
	}
	
	public void setDeliveredDate(Date deliveredDate) {
		DeliveredDate = deliveredDate;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}
}
/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:24:20 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 27, 2015<br/>
 * Creation Time: 10:24:20 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_RECEIPT_DETAIL")
public class ReceiptDetail {
	private long id;
	private Receipt receipt;
	private ProductDetail productDetail;
	private float price;
	private int quantity;
	private float discount;
	private float vat;
	
	@Id
	@GeneratedValue
	@Column(name = "RECEIPT_DETAIL_ID")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name = "RECEIPT_ID")
	public Receipt getReceipt() {
		return receipt;
	}
	
	@OneToOne
	@JoinColumn(name = "PRODUCT_DETAIL_ID")
	public ProductDetail getProductDetail() {
		return productDetail;
	}
	
	@Column(name = "RECEIPT_DETAIL_PRICE")
	public float getPrice() {
		return price;
	}
	
	@Column(name = "RECEIPT_DETAIL_QUANTITY")
	public int getQuantity() {
		return quantity;
	}
	
	@Column(name = "RECEIPT_DETAIL_DISCOUNT")
	public float getDiscount() {
		return discount;
	}
	
	@Column(name = "RECEIPT_DETAIL_VAT")
	public float getVat() {
		return vat;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public void setVat(float vat) {
		this.vat = vat;
	}
}

/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:33:13 PM<br/>
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
 * Creation Time: 6:33:13 PM<br/>
 * @author DucBui<br/>
 */
@Entity
@Table(name = "ES_PRODUCT_DETAIL")
public class ProductDetail {
	private long id;
	private Product product;
	private float price;
	private String picture;
	private Date postedDate;
	private Date updatedDate;
	private float discount;
	private int quantity;
	private int watchedQuantity;
	private int boughtQuantity;
	private ProductProvider productProvider;
	private ProductStatus productStatus;
	private float vat;
	private String link;
	private float ensurance;
	private Shop shop;
	private boolean active;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_DETAIL_ID")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	public Product getProduct() {
		return product;
	}
	
	@Column(name = "PRODUCT_DETAIL_PRICE")
	public float getPrice() {
		return price;
	}
	
	@Column(name = "PRODUCT_DETAIL_PICTURE")
	public String getPicture() {
		return picture;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRODUCT_DETAIL_POSTED_DATE")
	public Date getPostedDate() {
		return postedDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRODUCT_DETAIL_UPDATED_DATE")
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	@Column(name = "PRODUCT_DETAIL_DISCOUNT")
	public float getDiscount() {
		return discount;
	}
	
	@Column(name = "PRODUCT_DETAIL_QUANTITY")
	public int getQuantity() {
		return quantity;
	}
	
	@Column(name = "PRODUCT_DETAIL_WATCHED_QUANTITY")
	public int getWatchedQuantity() {
		return watchedQuantity;
	}
	
	@Column(name = "PRODUCT_DETAIL_BOUGHT_QUANTITY")
	public int getBoughtQuantity() {
		return boughtQuantity;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_PROVIDER_ID")
	public ProductProvider getProductProvider() {
		return productProvider;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_STATUS_ID")
	public ProductStatus getProductStatus() {
		return productStatus;
	}
	
	@Column(name = "PRODUCT_DETAIL_VAT")
	public float getVat() {
		return vat;
	}
	
	@Column(name = "PRODUCT_DETAIL_LINK")
	public String getLink() {
		return link;
	}
	
	@Column(name = "PRODUCT_DETAIL_ENSURANCE")
	public float getEnsurance() {
		return ensurance;
	}
	
	@ManyToOne
	@JoinColumn(name = "SHOP_ID")
	public Shop getShop() {
		return shop;
	}
	
	@Column(name = "PRODUCT_DETAIL_ACTIVVE")
	public boolean isActive() {
		return active;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setWatchedQuantity(int watchedQuantity) {
		this.watchedQuantity = watchedQuantity;
	}
	
	public void setBoughtQuantity(int boughtQuantity) {
		this.boughtQuantity = boughtQuantity;
	}
	
	public void setProductProvider(ProductProvider productProvider) {
		this.productProvider = productProvider;
	}
	
	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}
	
	public void setVat(float vat) {
		this.vat = vat;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public void setEnsurance(float ensurance) {
		this.ensurance = ensurance;
	}
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}

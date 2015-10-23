/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 23, 2015<br/>
 * Creation Time: 6:26:26 PM<br/>
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
 * Creation Time: 6:26:26 PM<br/>
 * @author DucBui<br/>
 */

@Entity
@Table(name = "ES_PRODUCT_INFO")
public class ProductInfo {
	private long id;
	private Product product;
	private ProductConfig productConfig;
	private String info;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_INFO_ID")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	public Product getProduct() {
		return product;
	}
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_CONFIG_ID")
	public ProductConfig getProductConfig() {
		return productConfig;
	}
	
	@Column(name = "PRODUCT_INFO_INFO")
	public String getInfo() {
		return info;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setProductConfig(ProductConfig productConfig) {
		this.productConfig = productConfig;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}

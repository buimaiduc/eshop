/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 13, 2015<br/>
 * Creation Time: 9:11:54 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 13, 2015<br/>
 * Creation Time: 9:11:54 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_SHOP_CONFIGURATION")
public class ShopConfiguration {
	private long id;
	private Shop shop;
	private String logo;
	private String header;
	private String footer;
	private Background background;
	private UI ui;
	private String address;
	private String introduction;
	private String policy;
	private int accessAmount;
	private String email;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SHOP_CONFIGURATION_ID")
	public long getId() {
		return id;
	}
	
	@OneToOne
	@JoinColumn(name = "SHOP_ID")
	public Shop getShop() {
		return shop;
	}
	
	@Column(name = "SHOP_CONFIGURATION_LOGO")
	public String getLogo() {
		return logo;
	}
	
	@Column(name = "SHOP_CONFIGURATION_HEADER")
	public String getHeader() {
		return header;
	}
	
	@Column(name = "SHOP_CONFIGURATION_FOOTER")
	public String getFooter() {
		return footer;
	}
	
	@ManyToOne
	@JoinColumn(name = "BACKGROUND_ID")
	public Background getBackground() {
		return background;
	}
	
	@ManyToOne
	@JoinColumn(name = "UI_ID")
	public UI getUi() {
		return ui;
	}
	
	@Column(name = "SHOP_CONFIGURATION_ADDRESS")
	public String getAddress() {
		return address;
	}
	
	@Column(name = "SHOP_CONFIGRUATION_INTRODUCTION")
	public String getIntroduction() {
		return introduction;
	}
	
	@Column(name = "SHOP_CONFIGURTAION_POLICY")
	public String getPolicy() {
		return policy;
	}
	
	@Column(name = "SHOP_CONFIGURATION_ACCESS_AMOUNT")
	public int getAccessAmount() {
		return accessAmount;
	}
	
	@Column(name = "SHOP_CONFIGURATION_EMAIL")
	public String getEmail() {
		return email;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}
	
	public void setFooter(String footer) {
		this.footer = footer;
	}
	
	public void setBackground(Background background) {
		this.background = background;
	}
	
	public void setUi(UI ui) {
		this.ui = ui;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
	public void setAccessAmount(int accessAmount) {
		this.accessAmount = accessAmount;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

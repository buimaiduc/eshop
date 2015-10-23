/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 13, 2015<br/>
 * Creation Time: 9:11:54 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import javax.persistence.Entity;
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
}

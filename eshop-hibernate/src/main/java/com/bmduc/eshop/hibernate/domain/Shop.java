/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:46:52 PM<br/>
 * @author ducb<br/>
 */
package com.bmduc.eshop.hibernate.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Oct 12, 2015<br/>
 * Creation Time: 9:46:52 PM<br/>
 * @author ducb<br/>
 */
@Entity
@Table(name = "ES_SHOP")
public class Shop {
	private long id;
	private String name;
	private User user;
	private boolean status;
	private PostingPackage postingPackage;
	private Date registerdDate;
	private Date dateOfBoughtPackage;
	private String phoneNumber;
	private String address;
	private String email;
	private ProvinceCode provinceCode;
}

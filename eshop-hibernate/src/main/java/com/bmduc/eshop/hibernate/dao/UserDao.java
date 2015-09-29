/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.dao;

import javax.naming.AuthenticationException;
import javax.persistence.EntityNotFoundException;

import com.bmduc.eshop.hibernate.domain.User;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
public interface UserDao extends GenericDao<User> {
	public User getUserByUsername(String username) throws EntityNotFoundException;

	public User authenticateUser(String username, String password) throws AuthenticationException;
}

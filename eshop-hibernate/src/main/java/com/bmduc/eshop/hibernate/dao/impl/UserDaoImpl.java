/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.dao.impl;

import java.util.List;

import javax.naming.AuthenticationException;
import javax.persistence.EntityNotFoundException;

import org.hibernate.Query;

import com.bmduc.eshop.hibernate.dao.AbstractGenericDao;
import com.bmduc.eshop.hibernate.dao.UserDao;
import com.bmduc.eshop.hibernate.domain.User;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
public class UserDaoImpl extends AbstractGenericDao<User> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}

	@SuppressWarnings("unchecked")
	public User getUserByUsername(String username) throws EntityNotFoundException {
		List<User> results = null;
		Query query = session.createQuery("from User as u where u.usename = :username");
		query.setParameter("username", username);
		results = query.list();
		
		if (results == null || results.size() == 0) {
			throw new EntityNotFoundException(username + " not found");
		} else {
			return results.get(0);
		}
	}

	public User authenticateUser(String username, String password) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}

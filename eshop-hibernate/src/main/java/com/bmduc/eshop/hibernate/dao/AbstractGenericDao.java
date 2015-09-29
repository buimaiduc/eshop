/*
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
package com.bmduc.eshop.hibernate.dao;

import java.util.List;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;

/**
 * ####################################################<br/>
 *   Copyright © Duc Bui 2015-2016<br/>
 * ####################################################<br/>
 * Creation date: Sep 28, 2015<br/>
 * Creation Time: 8:15:10 PM<br/>
 * @author DucBui<br/>
 */
public class AbstractGenericDao<T> implements GenericDao<T> {

	private Class<T> type;
	
	protected Session session;
	
	@PersistenceContext
	public void setSessionFactory(Session session) {
		this.session = session;
	}
	
	public AbstractGenericDao(Class<T> type) {
		super();
		this.type = type;
	}
	
	@SuppressWarnings("unchecked")
	public T get(Long id) {
		if (id == null) {
			return null;
		} else {
			return (T) session.get(type.getClass(), id);
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return session.createQuery("select o from " + type.getName() + "o").list();
	}

	public void save(T object) {
		session.persist(object);
	}

	public void delete(T object) {
		session.delete(object);
	}

}

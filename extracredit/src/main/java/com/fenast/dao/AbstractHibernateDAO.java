package com.fenast.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDAO<T extends Serializable> {
	private Class<T> clazz;
	
	@PersistenceContext
	private SessionFactory sessionFactory;
	
	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}
	
	public T findOne(final long id) {
		return (T) getCurrentSession().get(clazz,id);
	}
	
	public List<T> findAll() {
		return getCurrentSession().createQuery("From" + clazz.getName()).list();
	}
	
	public void save(final T entity) {
		getCurrentSession().persist(entity);
	}
	
	public T update(final T entity) {
		return (T) getCurrentSession().merge(entity);
	}
	
	public void delete(final T entity) {
		getCurrentSession().delete(entity);
	}
	
	public void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}
	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}

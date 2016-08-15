package com.fenast.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDAO<T extends Serializable> {
	private Class<T> clazz;
	
	@PersistenceContext
	private SessionFactory sessionFactory;
	
	public final void setClazz( Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}
	
	public T findOne(long id) {
		return (T) getCurrentSession().get(clazz,id);
	}
	
	public List<T> findAll() {
		return sessionFactory.createQuery("From" + clazz.getName()).getResultList();
	}
	
	public void create(T entity) {
		sessionFactory.persist(entity);
	}
	
	public T update(T entity) {
		return sessionFactory.merge(entity);
	}
	
	public void delete(T entity) {
		sessionFactory.remove(entity);
	}
	
	public void deleteById(long entityId) {
		T entity = findOne(entityId);
		delete(entity);
	}
}

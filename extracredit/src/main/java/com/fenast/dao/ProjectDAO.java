package com.fenast.dao;

import com.fenast.model.Project;


public class ProjectDAO extends AbstractHibernateDAO<Project> {

	public ProjectDAO() {
		setClazz(Project.class);
	}
	
}

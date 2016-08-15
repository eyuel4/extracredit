package com.fenast.dao;

import com.fenast.model.Project;


public class ProjectDAO extends AbstractJpaDAO<Project> {

	public ProjectDAO() {
		setClazz(Project.class);
	}
	
}

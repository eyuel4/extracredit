package com.fenast.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fenast.IService.IProjectService;
import com.fenast.dao.ProjectDAO;
import com.fenast.model.Project;

public class ProjectServiceImpl implements IProjectService {
	
	@Autowired
	private ProjectDAO projectdao;
	

	public void createProject(String title) {
		Project p = new Project();
		p.setTitle(title);
		projectdao.create(p);
	}




}

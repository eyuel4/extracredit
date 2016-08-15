package com.fenast.IService;

import org.springframework.transaction.annotation.Transactional;

import com.fenast.model.Project;

public interface IProjectService {
	@Transactional
	void createProject(String title);
	
}

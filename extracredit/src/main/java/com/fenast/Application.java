package com.fenast;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fenast.dao.ProjectDAO;
import com.fenast.model.Project;

public class Application {
	private static EntityManagerFactory emf;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("spring_jpa");
		}
		catch(Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		addProject();
		
	}
	public static void addProject() {
		ProjectDAO projectDAO = new ProjectDAO();
		Project p = new Project();
		p.setTitle("WATER");
		p.setDescription("WWWWW");
		projectDAO.create(p);
	}
}

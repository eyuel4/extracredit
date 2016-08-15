package com.fenast.test.daotest;

import org.springframework.transaction.annotation.Transactional;

import com.fenast.ServiceImpl.ProjectServiceImpl;

import junit.framework.TestCase;

public class projectdaotest extends TestCase {

	public void testSetClazz() {
		fail("Not yet implemented");
	}

	public void testFindOne() {
		fail("Not yet implemented");
	}

	public void testFindAll() {
		
	}
	
	
	public void testCreate() {
		ProjectServiceImpl ps = new ProjectServiceImpl();
		ps.createProject("Water");
	}

	public void testUpdate() {
		fail("Not yet implemented");
	}

	public void testDelete() {
		fail("Not yet implemented");
	}

	public void testDeleteById() {
		fail("Not yet implemented");
	}

}

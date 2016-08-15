package com.fenast.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mysql.fabric.xmlrpc.base.Array;

@Entity
@Table
public class Project {
	
	@Id
	@GeneratedValue
	private int projectNo;
	private String title;
	private String description;
	@Enumerated
	private Status staus;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@Embedded
	private Address location;
	private List<String> keywords;
	@OneToMany(mappedBy="project")
	private List<Tasks> tasks = new ArrayList<Tasks>();
	@ElementCollection
	private List<String> keyword = new ArrayList<String>();
	@OneToMany(mappedBy="project")
	private List<Beneficiary> beneficiary = new ArrayList<Beneficiary>();
	
	
	public Project() {
		super();
	}
	
	public Project(String title, String description, Status staus, Date startDate, Date endDate, Address location,
			List<String> keywords) {
		super();
		this.title = title;
		this.description = description;
		this.staus = staus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.keywords = keywords;
	}

	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStaus() {
		return staus;
	}
	public void setStaus(Status staus) {
		this.staus = staus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}

	public List<String> getKeyword() {
		return keyword;
	}

	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}
	
}

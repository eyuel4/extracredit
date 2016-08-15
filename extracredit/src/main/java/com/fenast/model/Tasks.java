package com.fenast.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Tasks {
	@Id
	@GeneratedValue
	private int taskId;
	@Enumerated
	private Status status;
	@OneToMany(mappedBy="task")
	private List<Resources> resource = new ArrayList<Resources>();
	@Lob
	private byte[] image;
	@ManyToMany
	@JoinTable(name="Task_Volunter",
				joinColumns=@JoinColumn(name="taskId"),
				inverseJoinColumns=@JoinColumn(name="id"))
	private List<Volunters> volunters = new ArrayList<Volunters>();
	
	@ManyToOne
	@JoinColumn(name="projectNo")
	private Project project;
	
	public Tasks() {
		super();
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Resources> getResource() {
		return resource;
	}

	public void setResource(List<Resources> resource) {
		this.resource = resource;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public List<Volunters> getVolunters() {
		return volunters;
	}

	public void setVolunters(List<Volunters> volunters) {
		this.volunters = volunters;
	}
	
	
}

package com.fenast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Beneficiary {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private byte[] images;
	@ManyToOne
	@JoinColumn(name="projectNo")
	private Project project;
	
	
	
	public Beneficiary() {
		super();
	}

	public Beneficiary(String name, String description, byte[] images) {
		super();
		this.name = name;
		this.description = description;
		this.images = images;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}
	
	
}

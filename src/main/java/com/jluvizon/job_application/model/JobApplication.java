package com.jluvizon.job_application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t001_job_application")
public class JobApplication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="a001_id")
	private Long id;
	
	@Column(name="a001_description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}

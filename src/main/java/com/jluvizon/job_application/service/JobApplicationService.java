package com.jluvizon.job_application.service;

import java.util.List;

import com.jluvizon.job_application.model.JobApplication;

public interface JobApplicationService {
	
	JobApplication findById(Long id);
	
	JobApplication create(JobApplication jobApplication);
	
	JobApplication update(JobApplication jobApplication);
	
	void delete(Long id);
	
	List<JobApplication> listAll();

}

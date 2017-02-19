package com.jluvizon.job_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluvizon.job_application.model.JobApplication;
import com.jluvizon.job_application.repository.JobApplicationRepository;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {
	
	@Autowired
	JobApplicationRepository jobApplicationRepository;

	@Override
	public JobApplication findById(Long id) {
		return jobApplicationRepository.findOne(id);
	}

	@Override
	public JobApplication create(JobApplication jobApplication) {
		return jobApplicationRepository.save(jobApplication);
	}

	@Override
	public JobApplication update(JobApplication jobApplication) {
		return jobApplicationRepository.save(jobApplication);
	}

	@Override
	public void delete(Long id) {
		jobApplicationRepository.delete(id);
	}

	@Override
	public List<JobApplication> listAll() {
		return jobApplicationRepository.findAll();		
	}

}

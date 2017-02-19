package com.jluvizon.job_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jluvizon.job_application.model.JobApplication;
import com.jluvizon.job_application.service.JobApplicationService;

@RestController
public class JobApplicationController {
	
	@Autowired
	JobApplicationService jobApplicationService;
	
	@PostMapping(name="createJobApplication", path="job-applications")
	public ResponseEntity<JobApplication> createJobApplication(@RequestBody JobApplication jobAppView){
		JobApplication jobApplication = jobApplicationService.create(jobAppView);
		return new ResponseEntity<JobApplication>(jobApplication, HttpStatus.OK);
	}
	
	@GetMapping(name="listJobsApplications", path="job-applications")
	public ResponseEntity<List<JobApplication>> listAllJobApplications(){
		List<JobApplication> jobApplications = jobApplicationService.listAll();
		return new ResponseEntity<>(jobApplications, HttpStatus.OK);
	}
	
	

}

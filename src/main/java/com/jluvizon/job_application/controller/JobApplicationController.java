package com.jluvizon.job_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jluvizon.job_application.model.JobApplication;
import com.jluvizon.job_application.service.JobApplicationService;

@RestController
public class JobApplicationController {
	
	@Autowired
	JobApplicationService jobApplicationService;
	
	@PostMapping(path="job-applications")
	public ResponseEntity<JobApplication> create(@RequestBody JobApplication jobAppView){
		JobApplication jobApplication = jobApplicationService.create(jobAppView);
		return new ResponseEntity<>(jobApplication, HttpStatus.OK);
	}
	
	@GetMapping(path="job-applications/{id}")
	public ResponseEntity<JobApplication> findById(@PathVariable Long id){
		JobApplication jobApplication = jobApplicationService.findById(id);
		return new ResponseEntity<>(jobApplication, HttpStatus.OK);
	}
	
	@GetMapping(path="job-applications")
	public ResponseEntity<List<JobApplication>> listAll(){
		List<JobApplication> jobApplications = jobApplicationService.listAll();
		return new ResponseEntity<>(jobApplications, HttpStatus.OK);
	}
	
	@PutMapping(path="job-applications/{id}")
	public ResponseEntity<JobApplication> update(@PathVariable Long id, @RequestBody JobApplication jobAppView){
		jobAppView.setId(id);
		JobApplication jobApplication = jobApplicationService.update(jobAppView);
		return new ResponseEntity<>(jobApplication, HttpStatus.OK);
	}
	
	@DeleteMapping(path="job-applications/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Long id){
		jobApplicationService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

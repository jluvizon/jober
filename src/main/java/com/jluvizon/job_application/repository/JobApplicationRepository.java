package com.jluvizon.job_application.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jluvizon.job_application.model.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Serializable> {

}

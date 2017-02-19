package com.jluvizon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jluvizon.job_application.model.JobApplication;
import com.jluvizon.job_application.repository.JobApplicationRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(JobApplicationRepository repository) {
		return (args) -> {

			JobApplication jobApplication = new JobApplication();
			jobApplication.setDescription("teste");

			repository.save(jobApplication);
		};
	}
}

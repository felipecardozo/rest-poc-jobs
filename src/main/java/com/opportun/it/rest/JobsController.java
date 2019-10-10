package com.opportun.it.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opportun.it.domain.JobPosition;
import com.opportun.it.service.JobService;

@RestController
public class JobsController {
	
	private JobService jobService;
	
	public JobsController(JobService jobService) {
		this.jobService = jobService;
	}
	
	@GetMapping("/jobs")
	public List<JobPosition> listJobs() {
		return jobService.retrievePosition();
	}

}

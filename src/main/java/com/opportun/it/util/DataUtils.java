package com.opportun.it.util;

import java.util.ArrayList;
import java.util.List;

import com.opportun.it.domain.JobPosition;

public class DataUtils {
	
	public static List<JobPosition> getMockData(){
		
		List<JobPosition> jobs = new ArrayList<>();
		
		JobPosition job1 = new JobPosition();
		job1.setCompany("Vouch");
		job1.setCompanyUrl("http://vouch.us");
		job1.setCreatedAt("Wed Oct 09 19:35:08 UTC 2019");
		job1.setDescription("<p>About us:\\nInsurance... sounds slow, old-fashioned, and unexciting. Exactly. Insurance is broken, and it's failing fast-moving, innovative startups.</p>\\n<p>Vouch is a new, technology-first insurance company, backed with $24.5M in funding from world-class investors. Like Stripe for payments or Brex for credit cards");
		job1.setId("be2b29b3-9be3-40dc-aa03-76b112acd03b");
		job1.setLocation("San Francisco");
		job1.setTitle("Senior Frontend Engineer");
		job1.setType("Full Time");
		job1.setUrl("https://jobs.github.com/positions/be2b29b3-9be3-40dc-aa03-76b112acd03b");
		
		JobPosition job2 = new JobPosition();
		job2.setCompany("Table XI");
		job2.setCompanyUrl("https://www.tablexi.com/");
		job2.setCreatedAt("Wed Oct 09 19:16:29 UTC 2019");
		job2.setDescription("<p><strong>What We're Looking For</strong></p>\\n<p>Table XI looks for team members who can see both the forest and the trees. Developing great products is about being equally concerned with building the right thing as building it well.</p>\\n<p>As a senior full stack developer at Table XI, we'd want you to:</p>\\n<ul>\\n<li>\\n<p>");
		job2.setId("4b17ca2b-1a93-479e-82bf-3af5fd8c3158");
		job2.setLocation("Chicago");
		job2.setTitle("Full Stack Software Developer");
		job2.setType("Full Time");
		job2.setUrl("https://jobs.github.com/positions/4b17ca2b-1a93-479e-82bf-3af5fd8c3158");
		
		jobs.add(job1);
		jobs.add(job2);
		return jobs;
		
	}
	
	
}

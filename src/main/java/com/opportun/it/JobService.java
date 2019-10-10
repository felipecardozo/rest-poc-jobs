package com.opportun.it;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.opportun.it.domain.JobPosition;

@Service
public class JobService {
	
	private final static String URL = "https://jobs.github.com/positions.json?search=java";
	
	private RestTemplate restTemplate;
	
	public JobService() {
		restTemplate = new RestTemplate();
	}
	
	public List<JobPosition> retrievePosition(){
		List<JobPosition> positions = new ArrayList<>();
		ResponseEntity<JobPosition[]> response = restTemplate.exchange(JobService.URL, HttpMethod.GET, null, JobPosition[].class);
		
		if( response!=null && response.getBody()!=null ) {
			positions.addAll( Arrays.asList(response.getBody()) );
		}
		
		return positions;
	}

}

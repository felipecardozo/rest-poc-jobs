package com.opportun.it.rest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.opportun.it.domain.JobPosition;
import com.opportun.it.service.JobService;
import com.opportun.it.util.DataUtils;

@RunWith(SpringRunner.class)
@WebMvcTest(JobsController.class)
public class JobControllerTest {
	
	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private JobService jobService;
	
	@Test
	public void givenNothingRetrievAllJobs() throws Exception {
		List<JobPosition> jobs = DataUtils.getMockData();
		given(jobService.retrievePosition()).willReturn(jobs);
		
		mvc.perform(get("/jobs")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(2)));

	}
	
	

}

package com.gso.assignment;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.gso.assignment.controller.CommitteeController;
import com.gso.assignment.domain.Committee;
import com.gso.assignment.service.CommitteeService;

@RunWith(SpringRunner.class)
@WebMvcTest(CommitteeController.class)
public class CommitteeControllerTests {
	
	@Autowired
    private MockMvc mvc;
	
	@MockBean
	private CommitteeService committeeService;
	
	@Test
	public void testGetParentCommittees() throws Exception {
//		Committee c1 = new Committee();
//		c1.setCode(1L);
//		c1.setName("one");
//		
//		Committee c2 = new Committee();
//		c2.setCode(1L);
//		c2.setName("two");
//		c2.setPcode(1L);
//		
//		when(committeeService.getParentCommittees()).thenReturn(Arrays.asList(c1, c2));
//		
//		mvc.perform(get("committees/parent"))
//		.andExpect(status().isOk())
//		.andExpect(view().name("committees/parent"));
	}
}

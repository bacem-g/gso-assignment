package com.gso.assignment;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gso.assignment.domain.Committee;
import com.gso.assignment.rest.CommitteeResource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommitteeResourceTests {

	@Autowired
	private CommitteeResource committeeResource;
	
	@Test
	public void testGetParentCommittees() {
		List<Committee> committees = committeeResource.getParentCommittees();
		assertEquals(3, committees.size());
		assertEquals(3, committees.get(0).getChildren().size());
		assertEquals(0, committees.get(1).getChildren().size());
		assertEquals(1, committees.get(2).getChildren().get(0).getChildren().size());
	}
	
	

}

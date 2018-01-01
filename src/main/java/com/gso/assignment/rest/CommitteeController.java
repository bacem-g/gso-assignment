package com.gso.assignment.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gso.assignment.domain.Committee;
import com.gso.assignment.service.CommitteeService;

@RestController
@RequestMapping("api/committees")
public class CommitteeController {

	private CommitteeService committeeService;
	
	public CommitteeController(CommitteeService committeeService) {
		this.committeeService = committeeService;
	}
	
	@GetMapping("/parent")
	public List<Committee> getParentCommittees() {
		return committeeService.getParentCommittees();
	}
}

package com.gso.assignment.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gso.assignment.domain.Committee;
import com.gso.assignment.service.CommitteeService;

@Controller
public class CommitteeController {

	private CommitteeService committeeService;
	
	public CommitteeController(CommitteeService committeeService) {
		this.committeeService = committeeService;
	}
	
	@RequestMapping("committees/parent")
    public String getParentCommittees(Model model) {
		List<Committee> committees = committeeService.getParentCommittees();
        model.addAttribute("committees", committees);
        
        return "parent-committees";
    }
}

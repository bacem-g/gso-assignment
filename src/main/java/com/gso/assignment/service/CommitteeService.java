package com.gso.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gso.assignment.domain.Committee;
import com.gso.assignment.mapper.CommitteeMapper;

@Service
@Transactional
public class CommitteeService {

	private CommitteeMapper committeeMapper;
	
	public CommitteeService(CommitteeMapper committeeRepository) {
		this.committeeMapper = committeeRepository;
	}
	
	public List<Committee> getParentCommittees() {
		List<Committee> committees = committeeMapper.findByParentIsNull();		
		return createCommitteeGraph(committees);
	}
	
	private List<Committee> createCommitteeGraph(List<Committee> committees) {
		for(Committee committee: committees) {
			List<Committee> children = committeeMapper.findByPcode(committee.getCode());
			committee.setChildren(children);
			if(!children.isEmpty()) {
				createCommitteeGraph(children);
			}
		}
		
		return committees;
	}
}

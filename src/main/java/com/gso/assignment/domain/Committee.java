package com.gso.assignment.domain;

import java.util.List;

public class Committee {
	
	private Long code;
	private String name;
	private Long pcode;
	private List<Committee> children;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPcode() {
		return pcode;
	}
	public void setPcode(Long pcode) {
		this.pcode = pcode;
	}
	public List<Committee> getChildren() {
		return children;
	}
	public void setChildren(List<Committee> children) {
		this.children = children;
	}
}

package com.gso.assignment.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.gso.assignment.domain.Committee;

@Mapper
public interface CommitteeRepository {

	@Results({
        @Result(property = "pcode", column = "p_code")
    })
	@Select("select * from Committee where p_code is null")
	public List<Committee> findByParentIsNull();
	
	@Results({
        @Result(property = "pcode", column = "p_code")
    })
	@Select("select * from Committee where p_code = #{pCode}")
	public List<Committee> findByPcode(Long pCode);
}

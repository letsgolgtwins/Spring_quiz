package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson04.domain.Realtor;

@Mapper
public interface RealtorMapper {

	// db에 insert
	public void insertRealtor(Realtor realtor); 
	
	// db에서 select
	public Realtor selectRealtorById(int id);
}

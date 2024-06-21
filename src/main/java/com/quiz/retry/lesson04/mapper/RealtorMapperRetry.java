package com.quiz.retry.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson04.domain.RealtorRetry;

@Mapper
public interface RealtorMapperRetry {

	// db에 insert
	public void insertRealtor(RealtorRetry realtorRetry);

	// db에서 select
	public RealtorRetry selectRealtorById(int id);
}

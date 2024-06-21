package com.quiz.retry.lesson04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson04.domain.RealtorRetry;
import com.quiz.retry.lesson04.mapper.RealtorMapperRetry;

@Service
public class RealtorServiceRetry {

	@Autowired
	private RealtorMapperRetry realtorMapperRetry;
	
	// db에 insert
	public void addRealtor(RealtorRetry realtorRetry) {
		realtorMapperRetry.insertRealtor(realtorRetry);
	}
	
	// db에서 select
	public RealtorRetry getRealtorById(int id) {
		return realtorMapperRetry.selectRealtorById(id);
	}
}

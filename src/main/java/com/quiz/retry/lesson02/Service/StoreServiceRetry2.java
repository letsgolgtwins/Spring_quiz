package com.quiz.retry.lesson02.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson02.domain.StoreRetry2;
import com.quiz.retry.lesson02.mapper.StoreMapperRetry2;

@Service
public class StoreServiceRetry2 {

	@Autowired
	private StoreMapperRetry2 storeMapperRetry2;
	
	// input: X & output: List
	public List<StoreRetry2> getStore() {
		return storeMapperRetry2.selectStore();
	}
}

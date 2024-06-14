package com.quiz.retry.lesson02.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson02.domain.StoreRetry;
import com.quiz.retry.lesson02.mapper.StoreMapperRetry;

@Service
public class StoreServiceRetry {

	@Autowired
	private StoreMapperRetry storeMapperRetry;
	
	// input: x (controller로 부터 다 내놓으라는 요청 받음)
	// output: List<domain> 
	public List<StoreRetry> getStoreList() {
		return storeMapperRetry.selectStoreRetryList();
	}
}

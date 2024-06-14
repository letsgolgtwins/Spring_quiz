package com.quiz.retry.lesson02.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson02.domain.StoreRetry;
import com.quiz.retry.lesson02.mapper.StoreMapperRetry;

@Service
public class StoreServiceRetry {

	@Autowired // DI
	private StoreMapperRetry storeMapperRetry;

	// input: X (controller로 부터 응답 받음)
	// output: List<domain> (mapper한테 받아서 controller한테 줄 거임)
	public List<StoreRetry> getStoreList() {
		return storeMapperRetry.selectStoreListRetry();
	}
}

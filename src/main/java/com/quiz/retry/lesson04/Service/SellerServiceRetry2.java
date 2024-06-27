package com.quiz.retry.lesson04.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson04.domain.SellerRetry2;
import com.quiz.retry.lesson04.mapper.SellerMapperRetry2;

@Service
public class SellerServiceRetry2 {

	@Autowired
	private SellerMapperRetry2 sellerMapperRetry2;
	
	// db에 insert
	public int addSellerRetry2(SellerRetry2 sellerRetry2) {
		return sellerMapperRetry2.insertSellerRetry2(sellerRetry2);
	}
	
	// db에서 select
	public List<SellerRetry2> getSellerRetry2() {
		return sellerMapperRetry2.selectSellerRetry2();
	}
}

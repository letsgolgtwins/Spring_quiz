package com.quiz.retry.lesson04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson04.domain.SellerRetry;
import com.quiz.retry.lesson04.mapper.SellerMapperRetry;

@Service
public class SellerServiceRetry {

	@Autowired
	private SellerMapperRetry sellerMapperRetry;
	
	// quiz01_DB에 저장
	// input: 파라미터들 & output: 컨트롤러에게 줄 거 없음 
	public void addSellerRetry(String nickname, String profileImageUrl, double temperature) {
		sellerMapperRetry.insertSellerRetry(nickname, profileImageUrl, temperature);
	}
	
	// quiz01_DB에서 꺼내오기 select
	public SellerRetry getSellerRetry() {
		return sellerMapperRetry.selectSellerRetry();
	}
	
	// quiz01_seller검색 출력 by id parameter
	public SellerRetry getSellerRetryById(int id) {
		return sellerMapperRetry.selectSellerRetryById(id);
	}
}

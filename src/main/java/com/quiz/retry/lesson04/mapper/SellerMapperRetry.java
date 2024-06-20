package com.quiz.retry.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.retry.lesson04.domain.SellerRetry;

@Mapper
public interface SellerMapperRetry {

	// quiz01_DB에 저장
	public void insertSellerRetry(
			@Param("nickname") String nickname, 
			@Param("profileImageUrl") String profileImageUrl, 
			@Param("temperature") double temperature
			);
	
	// quiz01_최신 사용자 정보 가져오기
	public SellerRetry selectSellerRetry();
	
	// quiz01_seller검색 출력 by id parameter
	public SellerRetry selectSellerRetryById(int id);
}

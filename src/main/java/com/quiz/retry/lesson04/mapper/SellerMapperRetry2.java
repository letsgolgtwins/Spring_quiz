package com.quiz.retry.lesson04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson04.domain.SellerRetry2;

@Mapper
public interface SellerMapperRetry2 {

	// db에 insert
	public int insertSellerRetry2(SellerRetry2 sellerRetry2);
	
	// db에서 select
	public List<SellerRetry2> selectSellerRetry2();
}

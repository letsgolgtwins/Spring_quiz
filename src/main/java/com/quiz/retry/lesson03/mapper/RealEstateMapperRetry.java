package com.quiz.retry.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.retry.lesson03.domain.RealEstateRetry;

@Mapper
public interface RealEstateMapperRetry {

	// quiz01_1
	public RealEstateRetry selectRealEstateRetryById(int id);
	
	// quiz01_2
	public List<RealEstateRetry> selectRealEstateRetryByRentPrice(int rentPrice);
}

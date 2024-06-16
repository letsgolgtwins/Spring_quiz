package com.quiz.retry.lesson03.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson03.domain.RealEstateRetry;
import com.quiz.retry.lesson03.mapper.RealEstateMapperRetry;

@Service
public class RealEstateServiceRetry {

	@Autowired
	private RealEstateMapperRetry realEstateMapperRetry;
	
	// quiz01_1
	public RealEstateRetry getRealEstateRetryById(int id) {
		return realEstateMapperRetry.selectRealEstateRetryById(id);
	}
	
	// quiz01_2
	public List<RealEstateRetry> getRealEstateRetryByRentPrice(int rentPrice) {
		return realEstateMapperRetry.selectRealEstateRetryByRentPrice(rentPrice);
	}
}

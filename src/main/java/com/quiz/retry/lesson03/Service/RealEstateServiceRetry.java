package com.quiz.retry.lesson03.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	// quiz01_3
	public List<RealEstateRetry> getRealEstateRetryByAreaAndPrice(int area, int price) {
		Map<String, Object> map = new HashMap<>();
		map.put("area", area);
		map.put("price", price);
		return realEstateMapperRetry.selectRealEstateRetryByAreaAndprice(map);
	}
	
	// quiz02_1
	public int addRealEstateRetry(RealEstateRetry realEstateRetry) {
		return realEstateMapperRetry.insertRealEstateRetry(realEstateRetry);
	}
	
	// quiz02_2
	public int addRealEstateRetryAsField(int realtorId, String address, int area, String type, int price, int rentPrice) {
		return realEstateMapperRetry.insertRealEstateRetryAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	// quiz03
	public int updateRealEstateRetry(int id, String type, int price) {
		return realEstateMapperRetry.updateRealEstateRetry(id, type, price);
	}
	
	// quiz04
	public int deleteRealEstateRetryById(int id) {
		return realEstateMapperRetry.deleteRealEstateRetryById(id);
	}
}

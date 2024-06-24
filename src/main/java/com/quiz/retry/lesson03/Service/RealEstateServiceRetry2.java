package com.quiz.retry.lesson03.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.retry.lesson03.domain.RealEstateRetry2;
import com.quiz.retry.lesson03.mapper.RealEstateMapperRetry2;

@Service
public class RealEstateServiceRetry2 {

	@Autowired
	private RealEstateMapperRetry2 realEstateMapperRetry2;
	
	// lesson03 quiz01_1
	public RealEstateRetry2 getRealEstateById(int id) {
		return realEstateMapperRetry2.selectRealEstateById(id);
	}
	
	// lesson03 quiz01_2
	public List<RealEstateRetry2> getRealEstateByRentPrice(int rentPrice2) {
		return realEstateMapperRetry2.selectRealEstateByRentPrice(rentPrice2);
	}
	
	// lesson03 quiz01_3
	public List<RealEstateRetry2> getRealEstateByAreaAndPrice(int area, int price) {
		return realEstateMapperRetry2.selectRealEstateByAreaAndPrice(area, price);
	}
	
	// lesson03 quiz02_1
	public int addRealEstate(RealEstateRetry2 realEstateRetry2) {
		return realEstateMapperRetry2.insertRealEstate(realEstateRetry2);
	}
	
	// lesson03 quiz02_2
	public int addRealEstateByRentPrice(int realtorId, String address, int area, String type, int price, Integer rentPrice) {
		return realEstateMapperRetry2.insertRealEstateByRentPrice(realtorId, address, area, type, price, price);
	}
	
	// lesson03 quiz03
	public int updateRealEstateById(int id, String type, int price) {
		return realEstateMapperRetry2.updateRealEstateById(id, type, price);
	}
	
	// lesson03 quiz04
	public int deleteRealEstateById(int id) {
		return realEstateMapperRetry2.deleteRealEstateById(id);
	}
}

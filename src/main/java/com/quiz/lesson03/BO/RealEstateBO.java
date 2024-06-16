package com.quiz.lesson03.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	// quiz01_1
	public RealEstate getRealEstateById(int id) {
		return realEstateMapper.selectRealEstateMapperById(id);
	}
	
	// quiz01_2
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		return realEstateMapper.selectRealEstateMapperByRentPrice(rentPrice);
	}
	
	// quiz01_3
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) {
		return realEstateMapper.selectRealEstateMapperByAreaAndPrice(area, price);
	}
}

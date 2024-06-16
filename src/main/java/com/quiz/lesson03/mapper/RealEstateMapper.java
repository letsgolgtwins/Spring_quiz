package com.quiz.lesson03.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {
	// quiz01_1
	public RealEstate selectRealEstateMapperById(int id);
	
	// quiz01_2
	public List<RealEstate> selectRealEstateMapperByRentPrice(int rentPrice);

	// quiz01_3
	public List<RealEstate> selectRealEstateMapperByAreaAndPrice(Map<String, Object> map);
}

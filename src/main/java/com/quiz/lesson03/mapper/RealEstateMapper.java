package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {
	// input
	// output
	public RealEstate selectRealEstateMapperById(int id);
	
	public List<RealEstate> selectRealEstateMapperByRentPrice(int rentPrice);
}

package com.quiz.retry.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.retry.lesson03.domain.RealEstateRetry2;

@Mapper
public interface RealEstateMapperRetry2 {

	// lesson03 quiz01_1
	public RealEstateRetry2 selectRealEstateById(int id);
	
	// lesson03 quiz01_2
	public List<RealEstateRetry2> selectRealEstateByRentPrice(int rentPrice);

	// lesson03 quiz01_3
	public List<RealEstateRetry2> selectRealEstateByAreaAndPrice(
			@Param("area") int area, 
			@Param("price") int price);
	
	// lesson03 quiz02_1
	public int insertRealEstate(RealEstateRetry2 realEstateRetry2);
	
	// lesson03 quiz02_2
	public int insertRealEstateByRentPrice(
			@Param("realtorId") int realtorId,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice
			);
	
	// lesson03 quiz03
	public int updateRealEstateById(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
}

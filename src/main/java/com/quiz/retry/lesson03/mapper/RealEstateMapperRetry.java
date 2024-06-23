package com.quiz.retry.lesson03.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.retry.lesson03.domain.RealEstateRetry;

@Mapper
public interface RealEstateMapperRetry {

	// quiz01_1
	public RealEstateRetry selectRealEstateRetryById(int id);
	
	// quiz01_2
	public List<RealEstateRetry> selectRealEstateRetryByRentPrice(int rentPrice);

	// quiz01_3
	public List<RealEstateRetry> selectRealEstateRetryByAreaAndprice(Map<String, Object> map);
	
	// quiz02_1
	public int insertRealEstateRetry(RealEstateRetry realEstateRetry);
	
	// quiz02_2
	public int insertRealEstateRetryAsField(
			@Param("realtorId") int realtorId, 
			@Param("address") String address, 
			@Param("area") int area, 
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") int rentPrice
			);
	
	// quiz03
	public int updateRealEstateRetry(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price
			);
	
	// quiz04
	public int deleteRealEstateRetryById(int id);
}

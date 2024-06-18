package com.quiz.lesson03.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {
	// quiz01_1 select
	public RealEstate selectRealEstateMapperById(int id);
	
	// quiz01_2 select
	public List<RealEstate> selectRealEstateMapperByRentPrice(int rentPrice);

	// quiz01_3 select
//	public List<RealEstate> selectRealEstateMapperByAreaAndPrice(Map<String, Object> map);
	
	// quiz01_3 select 모범답안
	// mapper 인터페이스가 xml파라미터 전송시 1개만 보낼 수 있다.
	// @Param 어노테이션을 사용하면 파라미터를 하나의 맵으로 구성해준다.
	public List<RealEstate> selectRealEstateMapperByAreaAndPrice(
			@Param("area") int area, // "area" key이름 <- 얘가 #{ } 안에 들어간다. 일치가 중요함 
			@Param("price") int price);
	
	// quiz02_1 insert
	public int insertRealEstate(RealEstate realestate);
	
	// quiz02_2 insert
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId, 
			@Param("address") String address, 
			@Param("area") int area, 
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") int rentPrice
			);
	
	// quiz03 update
	public int updateRealEstateAsField(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price
			);
	
	// quiz04 delete
	public int deleteRealEstateById(int id);
}

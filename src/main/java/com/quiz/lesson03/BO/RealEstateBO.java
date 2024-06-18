package com.quiz.lesson03.BO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	// quiz01_1 select
	public RealEstate getRealEstateById(int id) {
		return realEstateMapper.selectRealEstateMapperById(id);
	}
	
	// quiz01_2 select
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		return realEstateMapper.selectRealEstateMapperByRentPrice(rentPrice);
	}
	
	// quiz01_3 select
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) { // input: 컨트롤러로부터 넘어오는 값 output: 여러개의 행
//		Map<String, Object> map = new HashMap<>();
//		map.put("area", area);
//		map.put("price", price);
		return realEstateMapper.selectRealEstateMapperByAreaAndPrice(area, price);
	}
	
	// quiz02_1 insert
	// input: RealEstate
	// output: 성공한 행의 개수
	public int addRealEstate(RealEstate realestate) {
		return realEstateMapper.insertRealEstate(realestate);
	}
	
	// quiz02_2 insert
	public int addRealEstateAsField(int realtorId, String address, int area, String type, int price, Integer rentPrice) { // null허용 컬럼은 꼭 대문자 자료형으로 해줘야 한다.
		return realEstateMapper.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	// quiz03 update
	public int updateRealEstateAsField(int id, String type, int price) {
		return realEstateMapper.updateRealEstateAsField(id, type, price);
	}
}

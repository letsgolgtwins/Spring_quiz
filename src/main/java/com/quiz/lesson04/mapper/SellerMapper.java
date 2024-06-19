package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson04.domain.Seller;

@Mapper
public interface SellerMapper {

	// lesson04 quiz01_1
	public int insertSeller( // int(이 경우 BO가 안쓰면됨)거나 void여도 된다.
			@Param("nickname") String nickname, 
			@Param("profileUrl") String profileUrl, 
			@Param("temperature") double temperature
			);
	
	// lesson04 quiz01_2
	public Seller selectSeller();
		
	// lesson04 quiz01_3
	public Seller selectSellerById(int id);
}

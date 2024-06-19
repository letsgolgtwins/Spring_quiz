package com.quiz.lesson04.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.domain.Seller;
import com.quiz.lesson04.mapper.SellerMapper;

@Service
public class SellerBO {

	@Autowired
	private SellerMapper sellerMapper;
	
	// lesson04 quiz01_1
	public void addSeller(String nickname, String profileUrl, double temperature) {
		sellerMapper.insertSeller(nickname, profileUrl, temperature);
	}
	
	// lesson04 quiz01_2
	public Seller getSeller() { // input: x & output: Seller(채워져 있거나 null)
		return sellerMapper.selectSeller();
	}
	
	// lesson04 quiz01_3
	public Seller getSellerById(int id) {
		return sellerMapper.selectSellerById(id);
	}
}

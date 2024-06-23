package com.quiz.retry.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry2;
import com.quiz.retry.lesson03.domain.RealEstateRetry2;

@RequestMapping("/retry/lesson03/quiz02/2nd")
@RestController
public class Lesson03Quiz02RestControllerRetry2 {

	@Autowired
	private RealEstateServiceRetry2 realEstateServiceRetry2;
	
	// 1. 객체로 insert 하기
	// http://localhost:8080/retry/lesson03/quiz02/2nd/01
	@GetMapping("/01")
	public String quiz02_1() {
		RealEstateRetry2 realEstateRetry2 = new RealEstateRetry2();
		realEstateRetry2.setRealtorId(3);
		realEstateRetry2.setAddress("반포아크로리버파크 107동 1202호");
		realEstateRetry2.setArea(97);
		realEstateRetry2.setType("매매");
		realEstateRetry2.setPrice(400000);
		
		int count1 = realEstateServiceRetry2.addRealEstate(realEstateRetry2);
		return "입력 성공 : " + count1;
	}
	
	// 2. 필드로 insert 하기 
	// http://localhost:8080/retry/lesson03/quiz02/2nd/02?realtor_id=5
	@GetMapping("/02")
	public String quiz02_2(@RequestParam("realtor_id") int realtorId) {
		int count2 = realEstateServiceRetry2.addRealEstateByRentPrice(realtorId, "반포래미안원베일리 107동 1202호", 90, "매매", 200000, 230);
		return "입력 성공 : " + count2;
	}

	
}

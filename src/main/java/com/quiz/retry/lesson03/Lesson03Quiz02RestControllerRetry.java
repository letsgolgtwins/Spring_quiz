package com.quiz.retry.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry;
import com.quiz.retry.lesson03.domain.RealEstateRetry;

@RequestMapping("retry/lesson03/quiz02")
@RestController
public class Lesson03Quiz02RestControllerRetry {

	@Autowired
	private RealEstateServiceRetry realEstateServiceRetry;
	
	// 1. 객체로 insert 하기 
	// http://localhost:8080/retry/lesson03/quiz02/01
	@RequestMapping("/01")
	public String quiz02_1() {
		RealEstateRetry realEstateRetry = new RealEstateRetry();
		realEstateRetry.setRealtorId(3);
		realEstateRetry.setAddress("푸르지용 리버 303동 1104호 Retry");
		realEstateRetry.setArea(89);
		realEstateRetry.setType("매매");
		realEstateRetry.setPrice(100000);
		int count = realEstateServiceRetry.addRealEstateRetry(realEstateRetry);
		return "입력 성공 : " + count;
	}
	
	// 2. field로 insert 하기
	// http://localhost:8080/retry/lesson03/quiz02/02?realtor_id=6
	@RequestMapping("/02")
	public String quiz02_2(@RequestParam("realtor_id") int realtorId) {
		int count2 = realEstateServiceRetry.addRealEstateRetryAsField(realtorId, "쌍떼빌리버 오피스텔 814호 Retry", 45, "월세", 100000, 120);
		return "입력 성공 : " + count2;
	}
}

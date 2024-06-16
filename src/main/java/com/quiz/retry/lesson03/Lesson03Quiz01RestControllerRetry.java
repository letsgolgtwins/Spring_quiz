package com.quiz.retry.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.retry.lesson03.Service.RealEstateServiceRetry;
import com.quiz.retry.lesson03.domain.RealEstateRetry;

@RequestMapping("/retry/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestControllerRetry {

	@Autowired
	private RealEstateServiceRetry realEstateServiceRetry;

	// 비필수 파라미터로 만들기
	// http://localhost:8080/retry/lesson03/quiz01/01?id=7
	@RequestMapping("/01")
	public RealEstateRetry quiz01_01(@RequestParam(value = "id", defaultValue = "1") int id) {
		return realEstateServiceRetry.getRealEstateRetryById(id);
	}
	
	// 필수 파라미터로 만들기
	// http://localhost:8080/retry/lesson03/quiz01/02?rent_price=90
	@RequestMapping("/02")
	public List<RealEstateRetry> quiz01_2(@RequestParam("rent_price") int rentPrice) {
		return realEstateServiceRetry.getRealEstateRetryByRentPrice(rentPrice);
	}
	
}

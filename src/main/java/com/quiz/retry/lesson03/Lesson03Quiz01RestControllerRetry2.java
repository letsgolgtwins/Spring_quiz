package com.quiz.retry.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry2;
import com.quiz.retry.lesson03.domain.RealEstateRetry2;

@RequestMapping("/retry/lesson03/quiz01/2nd")
@RestController
public class Lesson03Quiz01RestControllerRetry2 {

	@Autowired
	private RealEstateServiceRetry2 realEstateServiceRetry2;

	// 1. id로 출력하기 (단건)
	// http://localhost:8080/retry/lesson03/quiz01/2nd/01?id=4
	@GetMapping("/01")
	public RealEstateRetry2 quiz01_1(@RequestParam("id") int id) {
		return realEstateServiceRetry2.getRealEstateById(id);
	}

	// 2. 월세 조건 select
	// http://localhost:8080/retry/lesson03/quiz01/2nd/02?rent_price=90
	@GetMapping("/02")
	public List<RealEstateRetry2> quiz01_2(@RequestParam("rent_price") Integer rentPrice) {
		return realEstateServiceRetry2.getRealEstateByRentPrice(rentPrice);
	}

	// 3. 복합조건 select
	// http://localhost:8080/retry/lesson03/quiz01/2nd/03?area=90&price=130000
	@GetMapping("/03")
	public List<RealEstateRetry2> quiz01_3(@RequestParam("area") int area, @RequestParam("price") int price) {
		return realEstateServiceRetry2.getRealEstateByAreaAndPrice(area, price);
	}

}

package com.quiz.retry.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry2;
import com.quiz.retry.lesson03.domain.RealEstateRetry2;

@RequestMapping("/retry/lesson03/quiz03/2nd")
@RestController
public class Lesson03Quiz03RestControllerRetry2 {

	@Autowired
	private RealEstateServiceRetry2 realEstateServiceRetry2;
	
	// http://localhost:8080/retry/lesson03/quiz03/2nd/01?id=9&type=매매&price=9000
	@GetMapping("/01")
	public String quiz03(
			@RequestParam("id") int id,
			@RequestParam("type") String type,
			@RequestParam("price") int price) {
		int count = realEstateServiceRetry2.updateRealEstateById(id, type, price);
		return "수정 성공 : " + count;
	}
	
}


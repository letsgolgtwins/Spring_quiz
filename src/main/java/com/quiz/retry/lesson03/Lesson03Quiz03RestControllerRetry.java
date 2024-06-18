package com.quiz.retry.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry;

@RestController
public class Lesson03Quiz03RestControllerRetry {

	@Autowired
	private RealEstateServiceRetry realEstateServiceRetry;
	
	// http://localhost:8080/retry/lesson03/quiz03/01?id=8&type=매매&price=70000
	@RequestMapping("/retry/lesson03/quiz03/01")
	public String quiz03(@RequestParam("id") int id, @RequestParam("type") String type, @RequestParam("price") int price) {
		int count = realEstateServiceRetry.updateRealEstateRetry(id, type, price);
		return "수정 성공 : " + count;
	}
}

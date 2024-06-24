package com.quiz.retry.lesson03;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry;

@RequestMapping("/retry/lesson03/quiz01")
@RestController
public class Lesson03Quiz04RestControllerRetry {

	@Autowired
	private RealEstateServiceRetry realEstateServiceRetry;
	
	// http://localhost:8080/retry/lesson03/quiz01/01?id=44
	@GetMapping("/01")
	public String quiz01(
			@RequestParam("id") int id) {
		int count = realEstateServiceRetry.deleteRealEstateRetryById(id);
		return "삭제 성공 : " + count;
	}
}

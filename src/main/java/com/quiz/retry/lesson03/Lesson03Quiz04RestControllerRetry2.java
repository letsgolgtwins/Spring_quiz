package com.quiz.retry.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson03.Service.RealEstateServiceRetry2;

@RequestMapping("/retry/lesson03/quiz04")
@RestController
public class Lesson03Quiz04RestControllerRetry2 {

	@Autowired
	private RealEstateServiceRetry2 realEstateServiceRetry2;
	
	// http://localhost:8080/retry/lesson03/quiz04/01?id=46
	@GetMapping("/01")
	public String quiz04(@RequestParam("id") int id) {
		int count = realEstateServiceRetry2.deleteRealEstateById(id);
		return "삭제 성공 : " + count;
	}
}

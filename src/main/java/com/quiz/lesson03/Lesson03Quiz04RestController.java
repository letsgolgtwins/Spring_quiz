package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.BO.RealEstateBO;

@RestController
public class Lesson03Quiz04RestController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	// http://localhost:8080/lesson03/quiz04/01?id=40
	@RequestMapping("/lesson03/quiz04/01")
	public String quiz04(@RequestParam("id") int id) {
		int count = realEstateBO.deleteRealEstateById(id);
		return "삭제 성공 : " + count;
	}
}

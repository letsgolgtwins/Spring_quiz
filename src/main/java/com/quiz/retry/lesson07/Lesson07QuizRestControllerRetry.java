package com.quiz.retry.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.retry.lesson04.domain.Company;
import com.quiz.retry.lesson07.BO.CompanyBORetry;
import com.quiz.retry.lesson07.Entity.CompanyEntityRetry;

@RequestMapping("/retry/lesson07")
@RestController
public class Lesson07QuizRestControllerRetry {

	@Autowired
	private CompanyBORetry companyBORetry;
	
	// 1_1. create(insert)
	// http://localhost:8080/retry/lesson07/save1
	@GetMapping("/save1")
	public CompanyEntityRetry save1() {
		String name = "넥손";
		String busniess = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		
		return companyBORetry.addCompanyEntity(name, busniess, scale, headcount);
	}
	
	// 1_2. create(insert)
	// http://localhost:8080/retry/lesson07/save2
	@GetMapping("/save2")
	public CompanyEntityRetry save2() {
		return companyBORetry.addCompanyEntity("버블팡", "여신 금융업", "대기업", 6834);
	}
}

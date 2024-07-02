package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.BO.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {

	@Autowired
	private CompanyBO companyBO;
	
	// http://localhost:8080/lesson07/quiz01/save1
	@GetMapping("/save1")
	public CompanyEntity save1() {
		String name = "넥슨";
		String busniess = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		
		return companyBO.addCompanyEntity(name, busniess, scale, headcount);
	}
	
	// http://localhost:8080/lesson07/quiz01/save2
	@GetMapping("/save2")
	public CompanyEntity save2() {
		String name = "버블팡";
		String busniess = "여신 금융업";
		String scale = "대기업";
		int headcount = 6834;
		
		return companyBO.addCompanyEntity2(name, busniess, scale, headcount);
	}
	
}

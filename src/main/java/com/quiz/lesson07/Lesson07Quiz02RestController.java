package com.quiz.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.Repository.CompanyRepository;
import com.quiz.lesson07.Repository.RecruitRepository;
import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.entity.RecruitEntity;

@RequestMapping("/lesson07/quiz02")
@RestController
public class Lesson07Quiz02RestController {

	// BO 없이 바로 Repository에서 가져오겠다.
	@Autowired
	private RecruitRepository recruitRepository;
	
	// 문제1 - JPQL
	// http://localhost:8080/lesson07/quiz02/select
	@GetMapping("/select")
	public List<RecruitEntity> select(@RequestParam("companyId") int companyId) {
		// 1. id가 57인 공고를 조회하고 아래와 같이 출력하세요.
		return recruitRepository.findAllById(57);
		
		// http://localhost:8080/lesson07/quiz02/select?companyId=1
		// 2. Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
		return recruitRepository.findAllByCompanyId(companyId);
	}
}











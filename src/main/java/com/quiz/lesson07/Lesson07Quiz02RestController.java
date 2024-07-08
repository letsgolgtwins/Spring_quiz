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

@RequestMapping("/lesson07/quiz02") // 조회를 하고 JSON으로 내려줄 거기 때문에 RestController 
@RestController
public class Lesson07Quiz02RestController {

	// BO 없이 바로 Repository에서 가져오겠다.
	@Autowired
	private RecruitRepository recruitRepository;
	
	// 문제1 - JPQL
	// 1. id가 57인 공고를 조회하고 아래와 같이 출력하세요.
	// http://localhost:8080/lesson07/quiz02/01
	@GetMapping("/01")
	public RecruitEntity quiz02_1() { // 단 건이므로 List가 절대 아니다.
		return recruitRepository.findById(57);
	}	
	
	// 2. Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
	// http://localhost:8080/lesson07/quiz02/02?companyId=1
	@GetMapping("/02")
	public List<RecruitEntity> quiz02_2(@RequestParam("companyId") int companyId) {		
		return recruitRepository.findAllByCompanyId(companyId); // 오타 주의 Entity에 있는 필드명 안틀리게 주의
	}
	
	// 3. 웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	// http://localhost:8080/lesson07/quiz02/03
	@GetMapping("/03")
	public List<RecruitEntity> quiz02_3() {
		return recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
	}
	
	// 4. 정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
	// http://localhost:8080/lesson07/quiz02/04
	@GetMapping("/04")
	public List<RecruitEntity> quiz02_4() { // GreaterThanEqual 처럼 Equal까지 붙여줘야지 >= 가 된다.
		return recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
	}
	
	// 5. 계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
	// http://localhost:8080/lesson07/quiz02/05
	@GetMapping("/05")
	public List<RecruitEntity> quiz02_5() {
		return recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
	}
	
	// 6. 성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
	// 지역: 성남시 분당구 / 연봉 7000~8500 / 
	// http://localhost:8080/lesson07/quiz02/06
	@GetMapping("/06")
	public List<RecruitEntity> quiz02_6() {
		return recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
	}
	
	// 문제2 - native query
	// 7. 마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
	// http://localhost:8080/lesson07/quiz02/07
	@GetMapping("/07")
	public List<RecruitEntity> quiz02_7() {
		return recruitRepository.findByDeadlineAndSalaryAndType("정규직", "2026-04-10", 8100);
	}
}











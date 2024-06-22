package com.quiz.retry.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.retry.lesson04.Service.CompanyService;
import com.quiz.retry.lesson04.domain.Company;

@RequestMapping("/retry/lesson04/tryMyself")
@Controller
public class Lesson04TryMyselfController {

	@Autowired
	private CompanyService companyService;
	
	// http://localhost:8080/retry/lesson04/tryMyself/01
	@GetMapping("/01")
	public String tryMyself() {
		return "lesson04/addCompany";
	}
	
	// postMapping
	@PostMapping("/addCompany")
	public String AddCompany(Company company, Model model) {
		
		// db에 insert
		companyService.addCompany(company);
		
		// db에서 select
		int id = company.getId();
		Company result = companyService.getCompanyById(id);
		
		// model에 담기
		model.addAttribute("result", result);
		model.addAttribute("title", "방금 가입한 회사 정보 테이블");
		
		// 최종화면
		return "lesson04/latestCompany";
	}
	
}

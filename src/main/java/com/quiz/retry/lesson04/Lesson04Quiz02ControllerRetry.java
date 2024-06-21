package com.quiz.retry.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.retry.lesson04.Service.RealtorServiceRetry;
import com.quiz.retry.lesson04.domain.RealtorRetry;

@RequestMapping("/retry/lesson04/quiz02")
@Controller
public class Lesson04Quiz02ControllerRetry {

	@Autowired
	private RealtorServiceRetry realtorServiceRetry;
	
	// http://localhost:8080/retry/lesson04/quiz02/add-realtor-view
	@GetMapping("/add-realtor-view")
	public String AddRealtorView() {
		return "lesson04/addRealtorViewRetry";
	}
	
	// DB에 저장
	@PostMapping("/add-realtor")
	public String AddRealtor(
			RealtorRetry realtorRetry, Model model) {
		
		// DB에 저장 - insert
		realtorServiceRetry.addRealtor(realtorRetry);
		
		// DB에서 꺼내옴 - select
		int id = realtorRetry.getId();
		realtorRetry = realtorServiceRetry.getRealtorById(id);
		
		// model에 담음
		model.addAttribute("title", "방금 추가된 공인중개사 정보");
		model.addAttribute("result", realtorRetry);
				
		// 최종 화면
		return "lesson04/latestRealtorRetry";
	}
}

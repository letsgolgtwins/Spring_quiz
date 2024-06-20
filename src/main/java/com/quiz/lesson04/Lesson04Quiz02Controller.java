package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.BO.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {

	@Autowired
	private RealtorBO realtorBO;
	
	// 공인중개사 추가 화면
	// http://localhost:8080/lesson04/quiz02/add-realtor-view
	@RequestMapping("/add-realtor-view")
	public String AddRealatorView() {
		return "lesson04/addRealatorView";
	}
	
	// 공인중개사 db에 추가(insert)
	@PostMapping("/add-realtor")
	public String AddRealator(
			@ModelAttribute Realtor realtor, Model model) { // @ModelAttribute는 사실 생략이 가능하다.^^
		
		// db에 저장 - insert
		realtorBO.addRealtor(realtor);
		
		// id를 가지고 db에서 select 
		int id = realtor.getId();
		Realtor latestRealtor = realtorBO.getRealtorById(id); 
		// 이건 그냥 찝찝해서 새로 Realtor latestRealtor를 만들어 저장한 것일뿐, 위의 realtor 객체를 재활용해도 된다. 그땐 realtor = realtorBO.getRealtorById(id); 인셈
		// getRealtorById() 안의 (id)도 사실 위의 int id = realtor.getId();를 생략하고, getRealtorById(realtor.getId()) 로 해도 된다.
		
		// model에 담기
		model.addAttribute("realtor", latestRealtor);
		
		// 최종 화면
		return "lesson04/latestRealtor";
	}
}

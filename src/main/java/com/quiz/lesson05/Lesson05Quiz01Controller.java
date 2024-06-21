package com.quiz.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Quiz01Controller {

	// http://localhost:8080/lesson05/quiz01/01
	@GetMapping("/lesson05/quiz01/01")
	public String quiz01() {
		return "lesson05/quiz01";
	}
}
